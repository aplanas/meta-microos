SUMMARY = "Documentation for texlive-rescansync"
DESCRIPTION = "This package includes the documentation for texlive-rescansync"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-doc-2023.201.0.0.0.0svn63856-53.1.noarch.rpm"
RPM_HASH = "01d561d0899ff5db3a2ca16e1a5c0d22bcda83cb761e57361c124b3d2371feb4ebb96be812e0151557643313a934785fe38e63236e1c6d34587f540e5fe66e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rescansync-doc"

RDEPENDS:${PN} += ""

inherit rpm
