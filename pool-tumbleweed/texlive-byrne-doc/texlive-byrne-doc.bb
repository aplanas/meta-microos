SUMMARY = "Documentation for texlive-byrne"
DESCRIPTION = "This package includes the documentation for texlive-byrne"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2.2svn61943"

RPM_NAME = "texlive-byrne-doc-2023.201.0.0.2.2svn61943-52.1.noarch.rpm"
RPM_HASH = "a8c078e174e37aeb53311f79b5504bc373b06ef2aa8a83089e44438a8c1af9bb94bc90cd3a08e06ce4de66a86a38de1449986348a55fe5793be18093c8737d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-byrne-doc"

RDEPENDS:${PN} += ""

inherit rpm
