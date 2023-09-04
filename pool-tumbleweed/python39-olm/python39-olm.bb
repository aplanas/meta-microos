SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python39 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.15"

RPM_NAME = "python39-olm-3.2.15-1.1.aarch64.rpm"
RPM_HASH = "e5f570f4d2212a64f7e9175e7eb0e36befe80a0f8506ea3b00462a92a45494abf842e9685f54ba6f0107aa69ee961de9aa7889b274611f4b637e58bded373541"

RPROVIDES:${PN} += "python3.9dist-python-olm \
python39-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python39-cffi"

inherit rpm
