SUMMARY = "Helper Library for the Use with Smart Cards and the PKCS#11 API"
DESCRIPTION = "pkcs11-helper allows using multiple PKCS#11 providers at the same time, \
selecting keys by id, label or certificate subject, handling card \
removal and card insert events, handling card re-insert to a different \
slot, supporting session expiration serialization and much more, all \
using a simple API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.29.0"

RPM_NAME = "libpkcs11-helper1-1.29.0-1.4.aarch64.rpm"
RPM_HASH = "8812ca3e7d6c11b473b6dce88798debc82127d80e4d90cdd01d85d4f365573f1ecab102b9cb35e896a069ae6727f60f43db0a2c6033e72ab6770575c7919be0d"

RPROVIDES:${PN} += "libpkcs11-helper.so.1 \
libpkcs11-helper1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
