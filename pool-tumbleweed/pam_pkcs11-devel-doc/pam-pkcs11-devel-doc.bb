SUMMARY = "PKCS #11 API PAM Documentation"
DESCRIPTION = "API documentation for pam_pkcs11 \
 \
This Linux PAM module allows X.509 a certificate-based user \
authentication."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.12"

RPM_NAME = "pam_pkcs11-devel-doc-0.6.12-4.4.aarch64.rpm"
RPM_HASH = "60ff886f4a6764621088cfb13bcf29da610f99d7c6ed8da1eb477ae6805f12cc7762728f5de8b2ac851d7474eb4de74bdde9ffd3b7cc1905a8a20c1b3d8d0f0a"

RPROVIDES:${PN} += "pam-pkcs11-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
