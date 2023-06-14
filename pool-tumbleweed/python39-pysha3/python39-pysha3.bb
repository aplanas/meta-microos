SUMMARY = "Python SHA3 wrapper library"
DESCRIPTION = "This is a python wrapper library for SHA-3 (keccak)."
LICENSE = "Python-2.0"

PV = "1.0.2"

RPM_NAME = "python39-pysha3-1.0.2-3.3.aarch64.rpm"
RPM_HASH = "6b19a06645ab6f05ab6bdd9200743df5c01d66e8a3e43104dc40d89ae5e3f261df17676d0f234e3afaa62883c8ad7a3b48131205232ecac11923b352b38de657"

RPROVIDES:${PN} += "python3.9dist-pysha3 \
python39-pysha3 \
python3dist-pysha3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
