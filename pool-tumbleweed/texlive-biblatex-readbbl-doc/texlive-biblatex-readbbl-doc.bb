SUMMARY = "Documentation for texlive-biblatex-readbbl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-readbbl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn61549"

RPM_NAME = "texlive-biblatex-readbbl-doc-2023.201.0.0.01svn61549-53.1.noarch.rpm"
RPM_HASH = "d1a5bb1b2e54cba0f0a53c5e0817284c093c4cdda9b5f4d2a0484c3c2bfa9aa74857fde9004c2d72ab42f4aa36a2d9f17f0a456fee200014925c0df44c9e9066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-readbbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
