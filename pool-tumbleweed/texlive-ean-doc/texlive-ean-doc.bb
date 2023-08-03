SUMMARY = "Documentation for texlive-ean"
DESCRIPTION = "This package includes the documentation for texlive-ean"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn20851"

RPM_NAME = "texlive-ean-doc-2023.209.svn20851-54.1.noarch.rpm"
RPM_HASH = "4299448ea3cba33d2b66534afe3a6abcbedd8a2fa6d3099af6941764776a288b7c3e2aa735dab16e5c6585ae5da1f12f330a2f69e62cdba0bfbda261666a5028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean-doc"

RDEPENDS:${PN} += ""

inherit rpm
