SUMMARY = "Documentation for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "This package includes the documentation for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-doc-2023.209.1.1svn55213-54.2.noarch.rpm"
RPM_HASH = "7fd156baa937230a92e26491602e30fe76e8ef277b1777caca54894052dc15e5175614c35999f58c6824643dbfa72b3c2d965f3f6e75c2fb8d45a4cb533904e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-doc"

RDEPENDS:${PN} += ""

inherit rpm
