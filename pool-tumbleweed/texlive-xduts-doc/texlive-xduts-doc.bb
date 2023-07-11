SUMMARY = "Documentation for texlive-xduts"
DESCRIPTION = "This package includes the documentation for texlive-xduts"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.2.0svn66472"

RPM_NAME = "texlive-xduts-doc-2023.201.6.1.2.0svn66472-52.2.noarch.rpm"
RPM_HASH = "280018ddd4e8bd0c12067585d7e96326e77347523a72912fa5e9bf85552ee931805a0e3d29cebf5a67d39a3f86307ab95932ffc4aeb47e1f2d8d122e18ccfcd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xduts-doc-zh \
texlive-xduts-doc"

RDEPENDS:${PN} += ""

inherit rpm
