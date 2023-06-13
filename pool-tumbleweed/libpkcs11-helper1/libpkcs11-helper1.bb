SUMMARY = "Helper Library for the Use with Smart Cards and the PKCS#11 API"
DESCRIPTION = "pkcs11-helper allows using multiple PKCS#11 providers at the same time, \
selecting keys by id, label or certificate subject, handling card \
removal and card insert events, handling card re-insert to a different \
slot, supporting session expiration serialization and much more, all \
using a simple API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.29.0"

RPM_NAME = "libpkcs11-helper1-1.29.0-1.3.aarch64.rpm"
RPM_HASH = "d5f356645029dabad6aded7ba376c3aa9d2bdec468d798cbb9db2549c355121ea19d64d8e4be29eef556ae08850f7b7538ee0324c5ceda838d17311768261c60"

RPROVIDES:${PN} += "libpkcs11-helper.so.1()(64bit) \
libpkcs11-helper1 \
libpkcs11-helper1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
