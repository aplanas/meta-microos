SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python311-pendulum-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "8e2350fbf79f020af1b1889a3fde968651a0081ed6ec3f6f7f61a7aa8058af81658f43ed8ce78afdeed474e96b9483bd8f634dd5a5187b5599d2e699cae38477"

RPROVIDES:${PN} += "python3.11dist(pendulum) \
python311-pendulum \
python311-pendulum(aarch-64) \
python3dist(pendulum)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-python-dateutil \
python311-pytz \
python311-pytzdata \
python311-typing"

inherit rpm
