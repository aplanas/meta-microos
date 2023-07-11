SUMMARY = "Documentation for texlive-marginnote"
DESCRIPTION = "This package includes the documentation for texlive-marginnote"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4bsvn48383"

RPM_NAME = "texlive-marginnote-doc-2023.208.1.4bsvn48383-53.1.noarch.rpm"
RPM_HASH = "e43bdbefc99985e4d03c7e666cb920e235f08419edb22cef804ce59cecc01266279d4aa124a926e3b9aca47155a4ac1d62093796388a2753df7a2e215684973b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
