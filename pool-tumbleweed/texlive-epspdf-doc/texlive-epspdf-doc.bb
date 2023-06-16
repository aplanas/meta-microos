SUMMARY = "Documentation for texlive-epspdf"
DESCRIPTION = "This package includes the documentation for texlive-epspdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-doc-2023.201.0.0.6.5.1svn66115-53.1.noarch.rpm"
RPM_HASH = "f763bf9ebe324d6b7979f8fbdc2a8d6f44788ea6866dafe29f83c93f89c913e20857944739032459922790683914c5431aaeeb9a7f0be90f9a3c2d7a185a72b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
