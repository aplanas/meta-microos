SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python39 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "python39-olm-3.2.14-1.6.aarch64.rpm"
RPM_HASH = "2a301715366c4558647bf4f826539bdd26e1dbb042fd505c6ad03aa8a89b9548f0fc7fb25f459e71995ba74d98ac0fcf2547b663605d6475156de28c2eb5270a"

RPROVIDES:${PN} += "python3.9dist-python-olm \
python39-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python39-cffi \
python39-future"

inherit rpm
