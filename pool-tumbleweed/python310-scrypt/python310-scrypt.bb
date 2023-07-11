SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.20"

RPM_NAME = "python310-scrypt-0.8.20-2.3.aarch64.rpm"
RPM_HASH = "e9c847f76b231f8f23efe220d8f31ab321eea104a1b41261a477879241c3442b0ae4431df28fdbc41062ad276fb78f4a052dc1c24d6cd59b7e770fb89d1c6dcb"

RPROVIDES:${PN} += "python3.10dist-scrypt \
python310-scrypt \
python3dist-scrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
python-abi"

inherit rpm
