SUMMARY = "Documentation for texlive-randtext"
DESCRIPTION = "This package includes the documentation for texlive-randtext"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-randtext-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "ca5d7745aee39a46a03333b4ce28ebcd9f19f4111e3a771c69b8058c6611f289f91cec1ef33692dcc1ec59250c81204b5205bab0ddcde7187d00b1bcb14ab0f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
