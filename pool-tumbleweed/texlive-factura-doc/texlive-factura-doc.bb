SUMMARY = "Documentation for texlive-factura"
DESCRIPTION = "This package includes the documentation for texlive-factura"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.32svn61697"

RPM_NAME = "texlive-factura-doc-2023.209.4.32svn61697-53.1.noarch.rpm"
RPM_HASH = "658ebc3c75645b11cc1ff4296a9f5d42a2eee3460b6fcf7360fcbff6b2fdc2a745454e1bf90ee5c27e1e53a902a5f285f655b344e3775627a77e6330ca398f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-factura-doc-es-VE \
texlive-factura-doc"

RDEPENDS:${PN} += ""

inherit rpm
