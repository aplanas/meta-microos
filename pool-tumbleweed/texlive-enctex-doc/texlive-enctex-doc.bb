SUMMARY = "Documentation for texlive-enctex"
DESCRIPTION = "This package includes the documentation for texlive-enctex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn34957"

RPM_NAME = "texlive-enctex-doc-2023.209.svn34957-54.2.noarch.rpm"
RPM_HASH = "7a2c280107923ff26bf85d0751f35acd69206dd9d314f17272499e107fd7e0a00f8e55e595f14cd9d07f94cbffb1b27cf4657675e18f6196c2072f85f927a4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-enctex-doc-en;cs \
texlive-enctex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
