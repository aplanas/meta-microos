SUMMARY = "Helper Library for the Use with Smart Cards and the PKCS#11 API"
DESCRIPTION = "pkcs11-helper allows using multiple PKCS#11 providers at the same time, \
selecting keys by id, label or certificate subject, handling card \
removal and card insert events, handling card re-insert to a different \
slot, supporting session expiration serialization and much more, all \
using a simple API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.29.0"

RPM_NAME = "pkcs11-helper-devel-1.29.0-1.4.aarch64.rpm"
RPM_HASH = "1215d12a8dc4b7988867ad4fbe9b3c35c9ff760806b8413c977eec058213165b67f632ef87719590fc05e8471c8b14dcbe07031f47fae63aee7b9e2b55d01d48"

RPROVIDES:${PN} += "pkcs11-helper-devel \
pkgconfig-libpkcs11-helper-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkcs11-helper \
pkgconfig-openssl"

inherit rpm
