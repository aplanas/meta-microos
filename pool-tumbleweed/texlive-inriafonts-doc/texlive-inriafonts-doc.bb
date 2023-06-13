SUMMARY = "Documentation for texlive-inriafonts"
DESCRIPTION = "This package includes the documentation for texlive-inriafonts"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn54512"

RPM_NAME = "texlive-inriafonts-doc-2023.201.1.0svn54512-52.1.noarch.rpm"
RPM_HASH = "9c557013af9605c190bd47d821bdbf2483260801b9cf4ed0ce97201a0a050dc26bc5bd5893b1b1eeb2defe33e2dc64ad882ab0026e200f9c113fde6aa5cda989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inriafonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
