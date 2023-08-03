SUMMARY = "Documentation for texlive-familytree"
DESCRIPTION = "This package includes the documentation for texlive-familytree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1svn63739"

RPM_NAME = "texlive-familytree-doc-2023.209.3.1svn63739-53.1.noarch.rpm"
RPM_HASH = "1853cc3cb540f70f71f669c4645d6f2ea9e9c329c0f196469eda70dc6feb83ab0ee3a4efd7d347bcd7471c2f01d06b77258d2a7ed21f267b9035317bdb838cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-familytree-doc-ja \
texlive-familytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
