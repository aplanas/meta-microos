SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python39-argon2-cffi-bindings-21.2.0-3.3.aarch64.rpm"
RPM_HASH = "af43f20c6f7f3f21483b57b70645038b18e59b2ecc4bddb3a6e7ab30dd7f29a52e0e211ab6cf6edde91282c82f49a06fed864c38b031847c90b8a938398b7dbd"

RPROVIDES:${PN} += "python3.9dist-argon2-cffi-bindings \
python39-argon2-cffi-bindings \
python3dist-argon2-cffi-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
python-abi \
python39-cffi"

inherit rpm
