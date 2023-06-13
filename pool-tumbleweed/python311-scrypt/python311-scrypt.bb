SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.20"

RPM_NAME = "python311-scrypt-0.8.20-1.7.aarch64.rpm"
RPM_HASH = "92d9e98a51f084244b69e7d8ec6420fa00546cc3f98640a4032cf80c932c63e1b689541a91b20d9f87b82fca3af61dcfc5351dd44948efde06b6b2e4c40efd68"

RPROVIDES:${PN} += "python3.11dist(scrypt) \
python311-scrypt \
python311-scrypt(aarch-64) \
python3dist(scrypt)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
python(abi)"

inherit rpm
