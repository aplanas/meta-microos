SUMMARY = "Python datetimes made easy"
DESCRIPTION = "Python datetimes made easy"
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python39-pendulum-2.1.2-3.3.aarch64.rpm"
RPM_HASH = "fd21c7917718a0e4bd8b0b4288bad28d4126b61ba2edcf09868a44668b3b36df23b0420ac2ec25702953c472134f565f3a085eed558dfae83fdf22cd7c261f15"

RPROVIDES:${PN} += "python3.9dist-pendulum \
python39-pendulum \
python3dist-pendulum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-python-dateutil \
python39-pytz \
python39-pytzdata \
python39-typing"

inherit rpm
