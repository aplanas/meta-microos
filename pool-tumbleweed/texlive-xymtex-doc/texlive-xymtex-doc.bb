SUMMARY = "Documentation for texlive-xymtex"
DESCRIPTION = "This package includes the documentation for texlive-xymtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.06svn32182"

RPM_NAME = "texlive-xymtex-doc-2023.209.5.06svn32182-53.2.noarch.rpm"
RPM_HASH = "8fd4e194cc11179cb6444b311bb90d0936aafbf72c961c8f8f0887f7da4a78e7c2675fdea9d164e86d368061da2f32566d8e95a350fc79a97ae4e24a13a6ff3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xymtex-doc-ja \
texlive-xymtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
