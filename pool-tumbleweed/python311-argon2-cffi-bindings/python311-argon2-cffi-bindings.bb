SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python311-argon2-cffi-bindings-21.2.0-2.4.aarch64.rpm"
RPM_HASH = "c3308d3ab3c43b7b6cb5e14cd30b54ea2a3d5c86bc43c5c86cf90f15e21aa7690e75dabfe8cdcd953a3b604e916cb52d45d2efb711d6913e098e4b40e59cfc03"

RPROVIDES:${PN} += "python3.11dist(argon2-cffi-bindings) \
python311-argon2-cffi-bindings \
python311-argon2-cffi-bindings(aarch-64) \
python311-argon2_cffi_bindings \
python3dist(argon2-cffi-bindings)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libargon2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-cffi"

inherit rpm
