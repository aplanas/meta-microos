SUMMARY = "Single Sign On Framework - Documentation"
DESCRIPTION = "This package contains the documentation for signond."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-docs-8.60-2.19.noarch.rpm"
RPM_HASH = "18601cd1eff6381ed95dde5bc80d056ff8b9827d7f55bc39981114e995949bd60571781cf8731c5cdfd9b353865cc9cfaaf9e7946fdba5a9731bdfb4efb0ff77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signond-docs"

RDEPENDS:${PN} += ""

inherit rpm
