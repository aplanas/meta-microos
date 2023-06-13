SUMMARY = "Documentation for texlive-pdfwin"
DESCRIPTION = "This package includes the documentation for texlive-pdfwin"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-pdfwin-doc-2023.201.svn54074-51.1.noarch.rpm"
RPM_HASH = "bf5f28e4f8ddad3423bca1dc155c7df18c1a1b4f7c772d499cdc39d9eb238bc3b2d195287c812b2170f835d05a55d291c90e9f4582138d83333fbf2ec7004b5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfwin-doc"

RDEPENDS:${PN} += ""

inherit rpm
