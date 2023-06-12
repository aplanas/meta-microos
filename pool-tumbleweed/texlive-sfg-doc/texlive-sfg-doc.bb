SUMMARY = "Documentation for texlive-sfg"
DESCRIPTION = "This package includes the documentation for texlive-sfg"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn20209"

RPM_NAME = "texlive-sfg-doc-2023.201.0.0.91svn20209-53.1.noarch.rpm"
RPM_HASH = "0fe45131df9d50da3dcee2bd89752a4960904dbb79fc810faea621414f34484b2d8e923064150b0b594818d26b0eafb36c38d4ed0a32f42f2d0052adb0f11101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sfg-doc"
RDEPENDS:${PN} += ""

inherit rpm
