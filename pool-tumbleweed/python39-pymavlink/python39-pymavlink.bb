SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.35"

RPM_NAME = "python39-pymavlink-2.4.35-1.6.aarch64.rpm"
RPM_HASH = "fd7f48902d8451125622edc60c557d9d23e75fb3e46a29bd061e727f13738ad9768c8f47a543a8e204110c23e28bcfa0dd02cf33ad96c2a53e2526344e4969d9"

RPROVIDES:${PN} += "python3.9dist-pymavlink \
python39-pymavlink \
python3dist-pymavlink"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-future \
python39-lxml \
update-alternatives"

inherit rpm
