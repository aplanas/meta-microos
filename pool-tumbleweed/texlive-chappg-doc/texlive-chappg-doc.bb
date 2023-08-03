SUMMARY = "Documentation for texlive-chappg"
DESCRIPTION = "This package includes the documentation for texlive-chappg"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1bsvn15878"

RPM_NAME = "texlive-chappg-doc-2023.209.2.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "f82bb887ca1df128d4559914ec22ddee5072e39cda1c973216bf9a433c35b43fc0a81ea39020b20da462152320569b05b5ed411fcdf371bdf80eac6efea9b897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chappg-doc"

RDEPENDS:${PN} += ""

inherit rpm
