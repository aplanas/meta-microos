SUMMARY = "Documentation for texlive-luatex"
DESCRIPTION = "This package includes the documentation for texlive-luatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66546"

RPM_NAME = "texlive-luatex-doc-2023.201.svn66546-52.1.noarch.rpm"
RPM_HASH = "fdc2c37f2e8bb13ae5f02fecc3c2e6d3e8360568a4b2181bb60a0570fb50bdc50b12c90e4e621183f058764976bd2d8114a0606b409bcbca87a7c8a5a8d49813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dviluatex.1) \
man(luatex.1) \
man(texlua.1) \
man(texluac.1) \
texlive-luatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
