SUMMARY = "Documentation for texlive-hwemoji"
DESCRIPTION = "This package includes the documentation for texlive-hwemoji"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65001"

RPM_NAME = "texlive-hwemoji-doc-2023.209.1.0svn65001-54.1.noarch.rpm"
RPM_HASH = "1ef4caad7062e274f6d1d11cca59e76d3c81bdf076d54188d9cad674b0b60623924e4c49f5a904eaff08da08ec5018809f9fe0036bcdc8348d2f073e86d2afd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hwemoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
