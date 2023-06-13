SUMMARY = "Documentation for texlive-uol-physics-report"
DESCRIPTION = "This package includes the documentation for texlive-uol-physics-report"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65761"

RPM_NAME = "texlive-uol-physics-report-doc-2023.201.1.1svn65761-53.1.noarch.rpm"
RPM_HASH = "44d93ecc1e148609ca9f8919a8d5461c6f5491fad6c9f8f7bc17104967635f8c1047d451fe5101f6ba0495b49913abc5082c49dd5266677e76f0abc0949bf177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uol-physics-report-doc"

RDEPENDS:${PN} += ""

inherit rpm
