SUMMARY = "Helper Library for the Use with Smart Cards and the PKCS#11 API"
DESCRIPTION = "pkcs11-helper allows using multiple PKCS#11 providers at the same time, \
selecting keys by id, label or certificate subject, handling card \
removal and card insert events, handling card re-insert to a different \
slot, supporting session expiration serialization and much more, all \
using a simple API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.29.0"

RPM_NAME = "pkcs11-helper-devel-1.29.0-1.3.aarch64.rpm"
RPM_HASH = "a227cc09b66fab1b125462aac564a6a8e89d45cc91069a824070186895f452eb1ac949688085745d19463b35d889bcc6077be1b57ed3f76e595c4e4f11d4f030"

RPROVIDES:${PN} += "pkcs11-helper-devel \
pkcs11-helper-devel(aarch-64) \
pkgconfig(libpkcs11-helper-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkcs11-helper \
pkgconfig(openssl)"

inherit rpm
