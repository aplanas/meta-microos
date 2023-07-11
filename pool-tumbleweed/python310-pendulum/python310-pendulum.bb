SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python310-pendulum-2.1.2-3.3.aarch64.rpm"
RPM_HASH = "eabbfea314893a1503af9840b67b8436a4251680daa959ba5774114e423ca00647c144465ee3930ec3e57fc12a0ffe8c059424be81d297fb2361fccae76d08c5"

RPROVIDES:${PN} += "python3.10dist-pendulum \
python310-pendulum \
python3dist-pendulum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-python-dateutil \
python310-pytz \
python310-pytzdata \
python310-typing"

inherit rpm
