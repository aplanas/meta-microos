SUMMARY = "Documentation for texlive-customdice"
DESCRIPTION = "This package includes the documentation for texlive-customdice"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn64089"

RPM_NAME = "texlive-customdice-doc-2023.204.1.1svn64089-54.1.noarch.rpm"
RPM_HASH = "e7438c6ed7d76d9501e9ddcf2a3cebe7696e519a831adf1ca0bc09dd0ac7ffab37c26b5dca581b610e469a1fcdd14070bd6af3f8a495259e4222c05d64ef0f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-customdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
