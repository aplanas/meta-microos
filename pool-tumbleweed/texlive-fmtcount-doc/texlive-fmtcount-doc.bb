SUMMARY = "Documentation for texlive-fmtcount"
DESCRIPTION = "This package includes the documentation for texlive-fmtcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.07svn53912"

RPM_NAME = "texlive-fmtcount-doc-2023.209.3.07svn53912-53.1.noarch.rpm"
RPM_HASH = "6c57fae23f615227d748244cc9e271dc645a15fa991a2a69767095d29d37c5ff4e3afed18dab73f91408d3126d55cbe3d4102da873d6938bec82b46423df1096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fmtcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
