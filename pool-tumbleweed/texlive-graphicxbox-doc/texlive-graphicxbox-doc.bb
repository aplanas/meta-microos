SUMMARY = "Documentation for texlive-graphicxbox"
DESCRIPTION = "This package includes the documentation for texlive-graphicxbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-doc-2023.201.1.0svn32630-53.2.noarch.rpm"
RPM_HASH = "c1b062456299cba6b426aaad66cce987b77bb912ab0bf6e36ca8c77bf2737bdfe011e2fdc1bcffd2429a9d3428fed8f19041a819601bd08b164fb70b49ea6903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
