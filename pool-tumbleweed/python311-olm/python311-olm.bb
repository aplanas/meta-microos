SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python311 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "python311-olm-3.2.14-1.6.aarch64.rpm"
RPM_HASH = "1bd41ed2345ad3fec6b58eb1d1700da1fc3322c8ba1684ecde8bdd4384777f56ec646551917dd7d9c3bf1428ac42bcfcc757e293ad37a428ca841b8e1be1b685"

RPROVIDES:${PN} += "python3-olm \
python3.11dist-python-olm \
python311-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python311-cffi \
python311-future"

inherit rpm
