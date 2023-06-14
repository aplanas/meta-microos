SUMMARY = "Documentation for texlive-pascaltriangle"
DESCRIPTION = "This package includes the documentation for texlive-pascaltriangle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn61774"

RPM_NAME = "texlive-pascaltriangle-doc-2023.201.1.0.1svn61774-51.1.noarch.rpm"
RPM_HASH = "fd51760347e37fd243bb946dc505746e73a05d61b49538492beccee607a8d65ad70aa3b3b49a843a9744141c6db2ac34fb931f78107107d0b12d0e85a809584c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-pascaltriangle-doc-zh \
texlive-pascaltriangle-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
