SUMMARY = "Documentation for texlive-zref-vario"
DESCRIPTION = "This package includes the documentation for texlive-zref-vario"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-doc-2023.209.0.0.1.7svn65453-53.1.noarch.rpm"
RPM_HASH = "dc5354d6434a2d1da6cee352cd4b92cb81902626ab39ba1b55aff782475a1198461edd71fce05009974f527669cfb554a562e451e494cc0ed603684b92dbc65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-vario-doc"

RDEPENDS:${PN} += ""

inherit rpm
