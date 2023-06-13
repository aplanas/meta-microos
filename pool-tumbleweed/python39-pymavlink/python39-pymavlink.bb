SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.35"

RPM_NAME = "python39-pymavlink-2.4.35-1.4.aarch64.rpm"
RPM_HASH = "2b70b9a934ee8a05e4d3b1206fa0169d085e92bef3cd7d69d7ed23f636b2de7964d2a7b98e1e96d90eefad3017f687e44e5316b5f4425facec36e05168ac97eb"

RPROVIDES:${PN} += "python3.9dist(pymavlink) \
python39-pymavlink \
python39-pymavlink(aarch-64) \
python3dist(pymavlink)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python39-future \
python39-lxml \
update-alternatives"

inherit rpm
