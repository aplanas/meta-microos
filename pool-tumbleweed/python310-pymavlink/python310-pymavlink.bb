SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.35"

RPM_NAME = "python310-pymavlink-2.4.35-1.6.aarch64.rpm"
RPM_HASH = "822c1a2a02304624557a7e22da78f7156d763043098f25081cebeade90068d29e637fa826bedfe7171b5f18618f6c5c9c338c994c5fe1cfe3bb90ff2de6b145f"

RPROVIDES:${PN} += "python3.10dist-pymavlink \
python310-pymavlink \
python3dist-pymavlink"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-future \
python310-lxml \
update-alternatives"

inherit rpm
