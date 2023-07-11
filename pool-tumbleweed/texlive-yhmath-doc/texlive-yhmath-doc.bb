SUMMARY = "Documentation for texlive-yhmath"
DESCRIPTION = "This package includes the documentation for texlive-yhmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54377"

RPM_NAME = "texlive-yhmath-doc-2023.201.1.6svn54377-52.2.noarch.rpm"
RPM_HASH = "c2931e398d7ec3a8b0d1a3b4992e717870f456766b2cbc81a9f43c9378ae39f50d4c3e907a81cf191881378e58b5936eb462814dd52c9fd9cf0a8154e1e9eb6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yhmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
