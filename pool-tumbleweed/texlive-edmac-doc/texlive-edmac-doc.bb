SUMMARY = "Documentation for texlive-edmac"
DESCRIPTION = "This package includes the documentation for texlive-edmac"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.17svn61719"

RPM_NAME = "texlive-edmac-doc-2023.201.3.17svn61719-53.2.noarch.rpm"
RPM_HASH = "fef4eadfa2768e346bd06af8d5728fb074da4ac6e67bec103da4d52be8eeb8384c6632bd173ba76ef0b00bd5ff9e91ac6ab116bcffe4142956988422da86e7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
