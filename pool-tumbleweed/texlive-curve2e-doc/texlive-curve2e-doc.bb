SUMMARY = "Documentation for texlive-curve2e"
DESCRIPTION = "This package includes the documentation for texlive-curve2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.22svn65469"

RPM_NAME = "texlive-curve2e-doc-2023.209.2.2.22svn65469-55.1.noarch.rpm"
RPM_HASH = "cde7701e666ad805748918bfd4ffd96c8ba34d890fa1ce381fde0a85f7ee10bda1a8e3dae306ee727f7e0d0c128543811dbe34d86500c0c0470322aa13c6b0d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curve2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
