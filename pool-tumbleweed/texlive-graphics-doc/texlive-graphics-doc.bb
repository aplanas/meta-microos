SUMMARY = "Documentation for texlive-graphics"
DESCRIPTION = "This package includes the documentation for texlive-graphics"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66204"

RPM_NAME = "texlive-graphics-doc-2023.209.svn66204-54.2.noarch.rpm"
RPM_HASH = "36ac71124f955d38ded5465ce90fbeb227f573c16b1efb2fa71ef7615f8f4c133dda521ce2f89e58c55e4bf165d414881cdf2d1a5fbab7f137e351ae2873387c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
