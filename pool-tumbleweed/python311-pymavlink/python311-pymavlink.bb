SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.35"

RPM_NAME = "python311-pymavlink-2.4.35-1.4.aarch64.rpm"
RPM_HASH = "a378ec6cf80ceb916959ba9c31fc3dfa3c60340ced78b9ebc0d817c3d2e9ef482b440a82c9a99ca94b07e8825fdd08ee5d720d7f621e76f48db0dad20f027f6a"

RPROVIDES:${PN} += "python3.11dist(pymavlink) \
python311-pymavlink \
python311-pymavlink(aarch-64) \
python3dist(pymavlink)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-future \
python311-lxml \
update-alternatives"

inherit rpm
