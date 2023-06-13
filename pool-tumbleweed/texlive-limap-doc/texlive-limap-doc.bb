SUMMARY = "Documentation for texlive-limap"
DESCRIPTION = "This package includes the documentation for texlive-limap"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn44863"

RPM_NAME = "texlive-limap-doc-2023.201.2.2svn44863-54.1.noarch.rpm"
RPM_HASH = "7b7883757cb85a33d0a36363764c78e2812dbae9162f59970f5278a5e1c3df0adab84dd89fc4f9de350128bc628b7936593f61a295702652a23e52095a1526bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-limap-doc"

RDEPENDS:${PN} += ""

inherit rpm
