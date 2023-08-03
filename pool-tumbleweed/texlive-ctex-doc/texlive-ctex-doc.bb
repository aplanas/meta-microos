SUMMARY = "Documentation for texlive-ctex"
DESCRIPTION = "This package includes the documentation for texlive-ctex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5.10svn66115"

RPM_NAME = "texlive-ctex-doc-2023.209.2.5.10svn66115-55.1.noarch.rpm"
RPM_HASH = "6e0707dde507564568f8544d4d769b67f662e64524325eebf25f6f56fd760d7f0529dab5ca4d0f14bc4c349f1e8729c4283b2cdc5c5102a71ef6d0a0a6ea945c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ctex-doc-zh \
texlive-ctex-doc"

RDEPENDS:${PN} += ""

inherit rpm
