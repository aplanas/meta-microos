SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python310 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "python310-olm-3.2.14-1.5.aarch64.rpm"
RPM_HASH = "232283b69d92bed0f5132103d6b0b5144029b2c0370584394d040b2aaadbf89308ed0a7bc1fb4b4bc137ac0bcf6e2a60d68ee353533826e443b7915bb9238f69"

RPROVIDES:${PN} += "python3-olm \
python3.10dist(python-olm) \
python310-olm \
python310-olm(aarch-64) \
python3dist(python-olm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libolm.so.3()(64bit) \
libolm3 \
python(abi) \
python310-cffi \
python310-future"

inherit rpm
