SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python39-argon2-cffi-bindings-21.2.0-2.4.aarch64.rpm"
RPM_HASH = "de06f998cc0eb4e5b69ee761218d8ce3c5058731b74d591f1503434a9e00bc338e77a31aca897cb74ca39ce0dcc5ed439e4e5d79a8a164efdeaf0999e099519b"

RPROVIDES:${PN} += "python3.9dist-argon2-cffi-bindings \
python39-argon2-cffi-bindings \
python3dist-argon2-cffi-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
python-abi \
python39-cffi"

inherit rpm
