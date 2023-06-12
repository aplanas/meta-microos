SUMMARY = "Documentation for texlive-pacioli"
DESCRIPTION = "This package includes the documentation for texlive-pacioli"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24947"

RPM_NAME = "texlive-pacioli-doc-2023.201.svn24947-51.1.noarch.rpm"
RPM_HASH = "d30a1b9c35d56b19bfa0a395255d5bc5e9e334c57ff793aec33d103e2f331947a0747509171e849d6d182ec9d1e6ca03ec0dbe0b0ef04cd24fca08e96273d501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pacioli-doc"
RDEPENDS:${PN} += ""

inherit rpm
