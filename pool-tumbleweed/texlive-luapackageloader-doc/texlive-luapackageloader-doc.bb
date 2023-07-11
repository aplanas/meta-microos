SUMMARY = "Documentation for texlive-luapackageloader"
DESCRIPTION = "This package includes the documentation for texlive-luapackageloader"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn54779"

RPM_NAME = "texlive-luapackageloader-doc-2023.208.0.0.2svn54779-53.1.noarch.rpm"
RPM_HASH = "d21c1ad1721288e7721f16901b8a98c69eaf21c5a51d7cfdd5823c03bade89cda4ada18a05d8a0acd8275a5b97f704d510f76fb9fe08a88902004db287fea580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapackageloader-doc"

RDEPENDS:${PN} += ""

inherit rpm
