SUMMARY = "Documentation for texlive-onlyamsmath"
DESCRIPTION = "This package includes the documentation for texlive-onlyamsmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.20svn42927"

RPM_NAME = "texlive-onlyamsmath-doc-2023.209.0.0.20svn42927-55.1.noarch.rpm"
RPM_HASH = "e4db3c69ac2eb4a78aca4c101c57470f73bdcc3ca99026963874ed8c2d41de5c67616815af14f0df00f5c446d9a9ea28fe366fd9fe743c901977c726e5f773a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onlyamsmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
