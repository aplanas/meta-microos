SUMMARY = "Documentation for texlive-zxjafont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafont"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62864"

RPM_NAME = "texlive-zxjafont-doc-2023.201.1.3svn62864-52.2.noarch.rpm"
RPM_HASH = "99e53eccda8a804c5ae04260fdf1854e2f271459145256902ec29337a7933217b10954ea5a46ac957d7ca890b0df3560fdf235d1391d486b66a050074e60b8e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjafont-doc-ja;en \
texlive-zxjafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
