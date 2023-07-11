SUMMARY = "Helper Library for the Use with Smart Cards and the PKCS#11 API"
DESCRIPTION = "pkcs11-helper allows using multiple PKCS#11 providers at the same \
time and selecting keys by id, label or certificate subject. \
Besides it covers the following topics: * Handling card removal \
and card insert events: \
* Handling card re-insert to a different slot \
* Supporting session expiration serialization \
* and much more All this is possible using a simple API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.29.0"

RPM_NAME = "pkcs11-helper-1.29.0-1.4.aarch64.rpm"
RPM_HASH = "2d3f213e245ab2aabb3a01d4cf81ae14c4973663d00b1eac6c46841aec9314bb7f25eb182b74041a5e5f2cc75a1a61fdc5d6f054154b323e5df89dd46f0dc804"

RPROVIDES:${PN} += "pkcs11-helper"

RDEPENDS:${PN} += "libpkcs11-helper1"

inherit rpm
