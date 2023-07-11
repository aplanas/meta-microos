SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python310 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "python310-olm-3.2.14-1.6.aarch64.rpm"
RPM_HASH = "f3a9474d63517d28978a0bd6319703926d15fa3557581d55a07e31196c9d23b26a26b3a1562718b18ed3410010457fb42ff0d8bd4d3321b524886bdecb5c86ed"

RPROVIDES:${PN} += "python3.10dist-python-olm \
python310-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python310-cffi \
python310-future"

inherit rpm
