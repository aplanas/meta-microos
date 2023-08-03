SUMMARY = "Documentation for texlive-revquantum"
DESCRIPTION = "This package includes the documentation for texlive-revquantum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-doc-2023.209.0.0.11svn43505-54.1.noarch.rpm"
RPM_HASH = "33ed51f7371b3389502889090ba3d97bb83abad8e1944f1cc41ffcc15ea6c7559cd3ff158c5a3adb4c938cde4113fd617399f24c1f928fa877bfe3d74ce0b7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revquantum-doc"

RDEPENDS:${PN} += ""

inherit rpm
