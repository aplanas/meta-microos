SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python39-pendulum-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "312cc6c91af74bc6711c3c4d2d68c3b8be49a3dc893f3fa83d340bff38155498bc30d126a84d5ae46fb713adc79aae24f0c63a4b827594040cc7301e39045ab5"

RPROVIDES:${PN} += "python3.9dist(pendulum) \
python39-pendulum \
python39-pendulum(aarch-64) \
python3dist(pendulum)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-python-dateutil \
python39-pytz \
python39-pytzdata \
python39-typing"

inherit rpm
