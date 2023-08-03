SUMMARY = "Documentation for texlive-vak"
DESCRIPTION = "This package includes the documentation for texlive-vak"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23431"

RPM_NAME = "texlive-vak-doc-2023.209.svn23431-54.1.noarch.rpm"
RPM_HASH = "b2d032e7c63d0d040af299c7364c5549ff62e8f037be7199d3240087e3df766b7d33b76c44fcf443a22d93e1b8ae20170d5221753ea7479aa1c1414a0d7dc219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-vak-doc-en \
texlive-vak-doc"

RDEPENDS:${PN} += ""

inherit rpm
