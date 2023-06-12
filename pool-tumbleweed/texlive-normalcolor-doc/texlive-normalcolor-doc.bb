SUMMARY = "Documentation for texlive-normalcolor"
DESCRIPTION = "This package includes the documentation for texlive-normalcolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.r11svn40125"

RPM_NAME = "texlive-normalcolor-doc-2023.201.r11svn40125-54.1.noarch.rpm"
RPM_HASH = "2753d4c5372e07fcb141f67851c3d062f7e8d1911f8069bd94cb0ed2316409771d00dd735f11f9cb352c160e881cf7fb1c2f3b07ccdb155a811b1b512f6780ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-normalcolor-doc"
RDEPENDS:${PN} += ""

inherit rpm
