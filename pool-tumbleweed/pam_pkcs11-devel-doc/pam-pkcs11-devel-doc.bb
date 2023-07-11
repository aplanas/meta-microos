SUMMARY = "PKCS #11 API PAM Documentation"
DESCRIPTION = "API documentation for pam_pkcs11 \
 \
This Linux PAM module allows X.509 a certificate-based user \
authentication."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.12"

RPM_NAME = "pam_pkcs11-devel-doc-0.6.12-4.5.aarch64.rpm"
RPM_HASH = "e074f49c83f20777fc0215670eac5be297f9f34ee617131ebb82f94291ca9768d60909a880c5e5bff5d8b5d61b7920750ca9cd5e9deb98fe6d51de83166fd214"

RPROVIDES:${PN} += "pam-pkcs11-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
