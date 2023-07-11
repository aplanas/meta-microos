SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python311-argon2-cffi-bindings-21.2.0-3.3.aarch64.rpm"
RPM_HASH = "24d49ac3711a4fad4d5fbcbc772576830a2965164b75775eaacc72eb9b6eae56771afbc7259ba6c5db90698478f73c2f56fbded2b3d0fc61f3f6d5aa5c8e423f"

RPROVIDES:${PN} += "python3-argon2-cffi-bindings \
python3.11dist-argon2-cffi-bindings \
python311-argon2-cffi-bindings \
python3dist-argon2-cffi-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
python-abi \
python311-cffi"

inherit rpm
