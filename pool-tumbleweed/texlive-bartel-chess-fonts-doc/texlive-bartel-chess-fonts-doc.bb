SUMMARY = "Documentation for texlive-bartel-chess-fonts"
DESCRIPTION = "This package includes the documentation for texlive-bartel-chess-fonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn20619"

RPM_NAME = "texlive-bartel-chess-fonts-doc-2023.209.svn20619-54.1.noarch.rpm"
RPM_HASH = "edf1fef7a0307de27475ea0abe218ec9512fc663b469bfd09bb1822b5cb5e066d083758df8ace36f6781fef178c29fe102a220f216cb298ddc1696cb7eb0ff9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bartel-chess-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
