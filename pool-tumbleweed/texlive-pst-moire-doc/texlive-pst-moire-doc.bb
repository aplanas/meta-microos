SUMMARY = "Documentation for texlive-pst-moire"
DESCRIPTION = "This package includes the documentation for texlive-pst-moire"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn60411"

RPM_NAME = "texlive-pst-moire-doc-2023.209.2.2svn60411-53.1.noarch.rpm"
RPM_HASH = "42190d93a8de2a6d66a9ae3fc6a346bd08ea07397456f60039f54ceedf5f96bc911f5c9febdada6f51619b71f45f24320022c19fe68e10a55da006f3682d3b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-moire-doc"

RDEPENDS:${PN} += ""

inherit rpm
