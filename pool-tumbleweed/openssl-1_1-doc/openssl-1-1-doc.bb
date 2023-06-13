SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "OpenSSL"

PV = "1.1.1u"

RPM_NAME = "openssl-1_1-doc-1.1.1u-1.1.noarch.rpm"
RPM_HASH = "463f68443a8709d22b6d28326d2e2cb87a0490307fdfd99d50c33c9334532da54c5fb062c9a3ddeeb2a3d10a870153fc96acc67d4e6947d812b0171fbc435193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-1_1-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
