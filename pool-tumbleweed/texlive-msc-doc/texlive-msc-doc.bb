SUMMARY = "Documentation for texlive-msc"
DESCRIPTION = "This package includes the documentation for texlive-msc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn63291"

RPM_NAME = "texlive-msc-doc-2023.201.2.00svn63291-54.1.noarch.rpm"
RPM_HASH = "7e5d8028dbb45ed5a577272c5bec13b3d3ad18cd4e481b8f6ce0c185ff4b365a4c7fd3ac31ea8411af629a6467d9c7d12bf28c16d710b4e278ff65a277bb2d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msc-doc"
RDEPENDS:${PN} += ""

inherit rpm
