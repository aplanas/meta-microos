SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python310-pendulum-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "bf7dc452246dcf139a6a25d473dff10d4b4a5c6a0d3bd14643aaf7d62a324e87eb1707b7e57516e6ac24a4d4e4f80be42844c4be9b8c93569d1d9fdedb3dae85"

RPROVIDES:${PN} += "python3-pendulum \
python3.10dist(pendulum) \
python310-pendulum \
python310-pendulum(aarch-64) \
python3dist(pendulum)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python310-python-dateutil \
python310-pytz \
python310-pytzdata \
python310-typing"

inherit rpm
