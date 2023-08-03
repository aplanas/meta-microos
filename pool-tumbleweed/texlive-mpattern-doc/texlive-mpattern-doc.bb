SUMMARY = "Documentation for texlive-mpattern"
DESCRIPTION = "This package includes the documentation for texlive-mpattern"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-mpattern-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "b3bf38adf8c96e3f43b2d8cb1e1ac2de0fc7daeec9eb04af8942c4dc38dd76870c16e7426ed9f76910e7c8e9a3b895eb329005d9cc0a37d3c16b1704e9ff7995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mpattern-doc-en;pl \
texlive-mpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
