SUMMARY = "Documentation for texlive-tikz-sfc"
DESCRIPTION = "This package includes the documentation for texlive-tikz-sfc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn49424"

RPM_NAME = "texlive-tikz-sfc-doc-2023.209.1.0.1svn49424-53.1.noarch.rpm"
RPM_HASH = "b95a4802a5c25e778cd05883b0cfa77ef488622bcba753f57e15f3c967196de31bcd8faf5b5cfa4b7853bd4e4759d3f4af04e12bb81518f25c8b3d7fe97a088c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-sfc-doc"

RDEPENDS:${PN} += ""

inherit rpm
