SUMMARY = "Documentation for texlive-thucoursework"
DESCRIPTION = "This package includes the documentation for texlive-thucoursework"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn56435"

RPM_NAME = "texlive-thucoursework-doc-2023.209.2.6svn56435-55.1.noarch.rpm"
RPM_HASH = "bc042d2d31b2b731baf7c235ada5dd12eb1f0745aefc36b6ab9ca7c8021c6915a52dc3142a8a2b63b08b4d2827544dd0bf8172117799397efbd6765197b34fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thucoursework-doc-zh \
texlive-thucoursework-doc"

RDEPENDS:${PN} += ""

inherit rpm
