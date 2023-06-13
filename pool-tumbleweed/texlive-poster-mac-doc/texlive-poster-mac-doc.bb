SUMMARY = "Documentation for texlive-poster-mac"
DESCRIPTION = "This package includes the documentation for texlive-poster-mac"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn18305"

RPM_NAME = "texlive-poster-mac-doc-2023.201.1.1svn18305-52.1.noarch.rpm"
RPM_HASH = "3385b963f20c93dc7d20c80ce045e3beef52d779b66853c189f5efc5c0dc611a22ac503568ba1a4b7c0b97b68421a92fc2afd942efb6ca804f7e0a84c9724749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poster-mac-doc"

RDEPENDS:${PN} += ""

inherit rpm
