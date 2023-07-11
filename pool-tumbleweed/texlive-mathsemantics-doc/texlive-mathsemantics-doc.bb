SUMMARY = "Documentation for texlive-mathsemantics"
DESCRIPTION = "This package includes the documentation for texlive-mathsemantics"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.0svn63241"

RPM_NAME = "texlive-mathsemantics-doc-2023.208.1.0.0svn63241-53.1.noarch.rpm"
RPM_HASH = "aa69b7ab13a16b4241900d071aa905bf253ca2add65ee625be0a5dd9bce95a1cf1b10c45cfb4d4fd691085c8827d244f7cf7caa695de3382e6a7609df349997a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathsemantics-doc"

RDEPENDS:${PN} += ""

inherit rpm
