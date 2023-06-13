SUMMARY = "Documentation for texlive-graphics-pln"
DESCRIPTION = "This package includes the documentation for texlive-graphics-pln"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65187"

RPM_NAME = "texlive-graphics-pln-doc-2023.201.svn65187-53.1.noarch.rpm"
RPM_HASH = "afe0f673d03b87dd37e18a5f7c074f6ea0ed81106eceb25997bb0989229cdb86a0282b7baf8a976e3c5e23360c3c93b60989280085caa0a3189876f8c5c247ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-pln-doc"

RDEPENDS:${PN} += ""

inherit rpm
