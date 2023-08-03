SUMMARY = "Documentation for texlive-rubik"
DESCRIPTION = "This package includes the documentation for texlive-rubik"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0svn46791"

RPM_NAME = "texlive-rubik-doc-2023.209.5.0svn46791-54.1.noarch.rpm"
RPM_HASH = "0051bee944162cecda785550d5d624c7c75ede5005dea57172206a1c260f2a0a80288a7443b3c1f5c9d38a0ca3443e86ed8fbb37d8ca73c4f58850179e6665f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-rubikrotation.1 \
texlive-rubik-doc"

RDEPENDS:${PN} += ""

inherit rpm
