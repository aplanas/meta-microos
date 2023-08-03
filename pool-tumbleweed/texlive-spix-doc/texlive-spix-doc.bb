SUMMARY = "Documentation for texlive-spix"
DESCRIPTION = "This package includes the documentation for texlive-spix"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3.0svn65050"

RPM_NAME = "texlive-spix-doc-2023.209.1.3.0svn65050-58.1.noarch.rpm"
RPM_HASH = "12eb0ff47cfbc8b6d505c8d25f1b06cf0b222014c4a722b8e9691058fbefad6ae9b7849738973c8128458983449a0ae8b15fb5a6db28f7367c05b4dc9b1877cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-spix.1 \
texlive-spix-doc"

RDEPENDS:${PN} += ""

inherit rpm
