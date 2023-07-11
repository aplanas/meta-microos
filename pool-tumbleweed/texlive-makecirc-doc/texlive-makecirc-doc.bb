SUMMARY = "Documentation for texlive-makecirc"
DESCRIPTION = "This package includes the documentation for texlive-makecirc"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-makecirc-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "59eec5724779ca0f3dafe1ce0b33e8b77f1af0f54462f2b38075d65206ae8c76f30dd2d4ae8e4f9473a2eb16edb068e24ff1ecd7a22018e38a9d79dd6e3421c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makecirc-doc-en;es \
texlive-makecirc-doc"

RDEPENDS:${PN} += ""

inherit rpm
