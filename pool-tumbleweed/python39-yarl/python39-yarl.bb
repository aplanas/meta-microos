SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "python39-yarl-1.9.2-1.1.aarch64.rpm"
RPM_HASH = "8acbd170dc7251670b69b1a8437e76d3820bd47ccf25ff54634a508a52ca0fba7690fb0578dfb9fafe978c7219cb467a46757c84e69955796337273d4edbd59e"

RPROVIDES:${PN} += "python3.9dist-yarl \
python39-yarl \
python3dist-yarl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-idna \
python39-multidict"

inherit rpm
