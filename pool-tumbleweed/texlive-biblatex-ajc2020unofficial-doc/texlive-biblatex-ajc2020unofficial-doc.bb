SUMMARY = "Documentation for texlive-biblatex-ajc2020unofficial"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ajc2020unofficial"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn54401"

RPM_NAME = "texlive-biblatex-ajc2020unofficial-doc-2023.201.0.0.2.0svn54401-53.1.noarch.rpm"
RPM_HASH = "69d5c55034c3d0169f18d6baa2b93890376b445e1f12a208e4b81e3e890b416c7258b3abf185a0967b29e406b7f2f1395d2927b745569af2c9ae76b2e1a93935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ajc2020unofficial-doc"

RDEPENDS:${PN} += ""

inherit rpm
