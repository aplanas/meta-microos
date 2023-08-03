SUMMARY = "Documentation for texlive-latex-graphics-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-graphics-dev"
LICENSE = "LPPL-1.0"

PV = "2023.209.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-graphics-dev-doc-2023.209.20230501_pre_release_0svn64899-56.1.noarch.rpm"
RPM_HASH = "ea6226872a52a3b901abf1709dad4ab5af82bb8ba73b901d12a571451264fffa3b2cf53ecb4505ef99f73d0062dd16c3ccdb508f2d44b745a0c68a6aec2e5093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-graphics-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
