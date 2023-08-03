SUMMARY = "Documentation for texlive-fontch"
DESCRIPTION = "This package includes the documentation for texlive-fontch"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn17859"

RPM_NAME = "texlive-fontch-doc-2023.209.2.2svn17859-53.1.noarch.rpm"
RPM_HASH = "9d3905bfbfd320d535fa5961f065433795204c8bc39af7c51c457a88bf58b58e3d1f454cf4cfa2f90d43ba8c377d81630af977dd983d131fdded922847da6d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontch-doc"

RDEPENDS:${PN} += ""

inherit rpm
