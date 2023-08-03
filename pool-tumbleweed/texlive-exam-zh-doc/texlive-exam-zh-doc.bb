SUMMARY = "Documentation for texlive-exam-zh"
DESCRIPTION = "This package includes the documentation for texlive-exam-zh"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.20svn64434"

RPM_NAME = "texlive-exam-zh-doc-2023.209.0.0.1.20svn64434-53.1.noarch.rpm"
RPM_HASH = "52876503862b68cda31d6c00a63750ab567aa5eee4880b09bc6c831dae7f6684645221d2b747187d5fdae8ec39c5830adaa996398a5e917a7cc595e422d229e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-zh-doc"

RDEPENDS:${PN} += ""

inherit rpm
