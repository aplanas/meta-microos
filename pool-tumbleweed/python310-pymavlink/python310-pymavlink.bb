SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.35"

RPM_NAME = "python310-pymavlink-2.4.35-1.4.aarch64.rpm"
RPM_HASH = "3f8f5612c4d0d38fefc5eeda1fb1b8a5be69f899b3f02437281e84f47b3631d2ec8959ed8fd61026dd2f88abf434753bfe84e871fa05e07f456f9cdbd8b3156d"

RPROVIDES:${PN} += "python3-pymavlink \
python3.10dist(pymavlink) \
python310-pymavlink \
python310-pymavlink(aarch-64) \
python3dist(pymavlink)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-future \
python310-lxml \
update-alternatives"

inherit rpm
