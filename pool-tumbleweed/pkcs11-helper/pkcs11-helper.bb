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

RPM_NAME = "pkcs11-helper-1.29.0-1.3.aarch64.rpm"
RPM_HASH = "361cb30caa000ff607f76a547dd5607c0d564e899ed1c73d427af0dd30216da73e6639fdb23f2022b1b89c0c7631d138a18c4a5c145a6dcc182d80d5858a539f"

RPROVIDES:${PN} += "pkcs11-helper"

RDEPENDS:${PN} += "libpkcs11-helper1"

inherit rpm
