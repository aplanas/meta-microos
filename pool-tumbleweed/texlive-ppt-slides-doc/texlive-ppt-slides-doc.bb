SUMMARY = "Documentation for texlive-ppt-slides"
DESCRIPTION = "This package includes the documentation for texlive-ppt-slides"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn65194"

RPM_NAME = "texlive-ppt-slides-doc-2023.209.0.0.2.1svn65194-53.1.noarch.rpm"
RPM_HASH = "c35515af819a36a0782802e39b675027e64acdb9f1c62e9f819675ccccdbfecce1cfb512fa3b0af360ab5f3731f3583f53bc31d5f120a6f559ab39a8655e0a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ppt-slides-doc"

RDEPENDS:${PN} += ""

inherit rpm
