SUMMARY = "Documentation for texlive-zref-vario"
DESCRIPTION = "This package includes the documentation for texlive-zref-vario"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-doc-2023.209.0.0.1.7svn65453-53.2.noarch.rpm"
RPM_HASH = "a5f207be1589056653be44e568345cdd222b6e66ce2d4692ae8f5b4aaed6652bb5bdde7e89d8ece2dafbf371ef01e525fa486e27f70ab3fcc452a14561839258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-vario-doc"

RDEPENDS:${PN} += ""

inherit rpm
