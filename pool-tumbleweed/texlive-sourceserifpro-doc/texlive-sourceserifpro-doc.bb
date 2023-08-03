SUMMARY = "Documentation for texlive-sourceserifpro"
DESCRIPTION = "This package includes the documentation for texlive-sourceserifpro"
LICENSE = "OFL-1.1"

PV = "2023.209.1.4svn54512"

RPM_NAME = "texlive-sourceserifpro-doc-2023.209.1.4svn54512-58.1.noarch.rpm"
RPM_HASH = "ff90b3484ae5905a63bb749abe3f6b90fe3676d1af3102cd887be70da4f42e3c06383055c705aa89344e1fc6e1de815420ff8b8d023106c37a69de39cd974ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sourceserifpro-doc"

RDEPENDS:${PN} += ""

inherit rpm
