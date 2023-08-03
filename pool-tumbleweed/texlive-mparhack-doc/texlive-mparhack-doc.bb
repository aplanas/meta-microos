SUMMARY = "Documentation for texlive-mparhack"
DESCRIPTION = "This package includes the documentation for texlive-mparhack"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.5svn59066"

RPM_NAME = "texlive-mparhack-doc-2023.209.1.5svn59066-55.1.noarch.rpm"
RPM_HASH = "508410d5feb24446ac7f62e0cabf11cd68052f80c00f0c01468eb299e0840ccdf8b291300b281a38378e050da92460137546cc3280beb3a2e73b90a1d174bd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mparhack-doc"

RDEPENDS:${PN} += ""

inherit rpm
