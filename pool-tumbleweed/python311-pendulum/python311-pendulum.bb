SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python311-pendulum-2.1.2-3.3.aarch64.rpm"
RPM_HASH = "34acc546dfad162453ef87d20d778435635aaf4f4cfc4074e87cd0b86b6f0a4a7231cb6dd030962b6bb1c9cdf8d625653557f7e97f44cf3c8143ef24df36f355"

RPROVIDES:${PN} += "python3-pendulum \
python3.11dist-pendulum \
python311-pendulum \
python3dist-pendulum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-python-dateutil \
python311-pytz \
python311-pytzdata \
python311-typing"

inherit rpm
