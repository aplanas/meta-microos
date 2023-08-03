SUMMARY = "Documentation for texlive-tikz-qtree"
DESCRIPTION = "This package includes the documentation for texlive-tikz-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2svn26108"

RPM_NAME = "texlive-tikz-qtree-doc-2023.209.1.2svn26108-53.1.noarch.rpm"
RPM_HASH = "e9c14516911d604d1b519c65124119e9389c2b66cae296246e9869558c33b55fa5c9993c9f6dca36f4dfce095966170c1ccba5d9ed7701efcf15ad026ef6a951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
