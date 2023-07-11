SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.35"

RPM_NAME = "python311-pymavlink-2.4.35-1.6.aarch64.rpm"
RPM_HASH = "fc87044d40a6dbdf495e6373c85f09748d995d5fa51a8a7b6f3c528e377094e8f0fa2689b27969888717f8b958871613bf033378e42fc3d3bc1a168dca3a1e53"

RPROVIDES:${PN} += "python3-pymavlink \
python3.11dist-pymavlink \
python311-pymavlink \
python3dist-pymavlink"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-future \
python311-lxml \
update-alternatives"

inherit rpm
