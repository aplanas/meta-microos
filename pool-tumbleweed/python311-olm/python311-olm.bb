SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python311 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.15"

RPM_NAME = "python311-olm-3.2.15-1.1.aarch64.rpm"
RPM_HASH = "83154d9ed656ed5362cdc18fc04d940948a9323744c6c4f781f8fd090770a717dbb4c5d394e9a8f89bfea3e7f6e3f5c115448d2f2b7a4443c5c0afc88687be9f"

RPROVIDES:${PN} += "python3-olm \
python3.11dist-python-olm \
python311-olm \
python3dist-python-olm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libolm.so.3 \
libolm3 \
python-abi \
python311-cffi"

inherit rpm
