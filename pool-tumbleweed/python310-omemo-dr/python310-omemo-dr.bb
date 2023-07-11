SUMMARY = "OMEMO Encryption Library"
DESCRIPTION = "Python library for handling OMEMO encryption."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python310-omemo-dr-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "9cbcfa6c6dcd9c73dd81016cb99640b38acbd90733fc8b7841c234e062af5e32bc47f80a187eb03e3ad6df581292f09c4a7dc6b5cc6feb4b63c5a697757f823e"

RPROVIDES:${PN} += "python3.10dist-omemo-dr \
python310-omemo-dr \
python3dist-omemo-dr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3.10dist-cryptography \
python3.10dist-protobuf \
python310-cryptography \
python310-protobuf"

inherit rpm
