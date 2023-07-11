SUMMARY = "Documentation for GNU Stow"
DESCRIPTION = "Documentation for GNU Stow 2.3.1 in HTML and PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.1"

RPM_NAME = "stow-doc-2.3.1-1.11.noarch.rpm"
RPM_HASH = "5b75e536320e9c35fe81f2d7e5692b7e6dbf9bcac9ebcf7a70f2008398f124448b769a5f0d4a88b21d755704596b630f894766063ea2a01765b831d178e2c5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stow-doc"

RDEPENDS:${PN} += "stow"

inherit rpm
