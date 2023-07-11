SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python310-argon2-cffi-bindings-21.2.0-3.3.aarch64.rpm"
RPM_HASH = "c1c6dd4ae8cd4d3227773c9e911269165d831e4d94ec9af6338d480d7671cf53894d9d42607b620da7cdb07ed3883ca5c47cc9816b238255ef6a8549700b0386"

RPROVIDES:${PN} += "python3.10dist-argon2-cffi-bindings \
python310-argon2-cffi-bindings \
python3dist-argon2-cffi-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
python-abi \
python310-cffi"

inherit rpm
