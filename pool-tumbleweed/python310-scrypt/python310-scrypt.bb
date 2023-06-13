SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.20"

RPM_NAME = "python310-scrypt-0.8.20-1.7.aarch64.rpm"
RPM_HASH = "855472453cc9dae118ef6e6865ae71b72583c66c08ca6aaabfeb0012b3c37bdb1beeb48eb3b748c129465362f411d2c91341c4d96eabc3311d3b6b5ef0584b6a"

RPROVIDES:${PN} += "python3-scrypt \
python3.10dist(scrypt) \
python310-scrypt \
python310-scrypt(aarch-64) \
python3dist(scrypt)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
python(abi)"

inherit rpm
