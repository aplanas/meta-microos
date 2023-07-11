SUMMARY = "Documentation for texlive-pxpic"
DESCRIPTION = "This package includes the documentation for texlive-pxpic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65803"

RPM_NAME = "texlive-pxpic-doc-2023.201.1.4svn65803-53.2.noarch.rpm"
RPM_HASH = "48b66c45c668347d276c2502a6156c85db74499558230a946c5890069f4ee421ed09eb716be2f87c7ad67738189cea1f0e0a6cfca8fbddac1df803dac8737af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
