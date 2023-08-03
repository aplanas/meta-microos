SUMMARY = "Documentation for texlive-biblatex-ieee"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ieee"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3fsvn61243"

RPM_NAME = "texlive-biblatex-ieee-doc-2023.209.1.3fsvn61243-54.1.noarch.rpm"
RPM_HASH = "e7700f5969349772d1d21e919fb6662ae6328c8091c9c140e714bec8c7718ba6544bce1d78b4f4e022a89c1d3015ad48fe561b9f72487b71f01762ba927b85f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ieee-doc"

RDEPENDS:${PN} += ""

inherit rpm
