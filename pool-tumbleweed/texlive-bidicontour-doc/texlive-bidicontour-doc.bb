SUMMARY = "Documentation for texlive-bidicontour"
DESCRIPTION = "This package includes the documentation for texlive-bidicontour"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn34631"

RPM_NAME = "texlive-bidicontour-doc-2023.209.0.0.2svn34631-54.1.noarch.rpm"
RPM_HASH = "dd0deafb147331924e565121ee8b19c1337ddf0881a3ba8309361a2c94cd40ab2b8546e10ddf5f68fc7d2978cc7d22525c3e5bbb62e9af159596dde91fb93fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidicontour-doc"

RDEPENDS:${PN} += ""

inherit rpm
