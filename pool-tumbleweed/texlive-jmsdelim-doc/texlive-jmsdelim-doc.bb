SUMMARY = "Documentation for texlive-jmsdelim"
DESCRIPTION = "This package includes the documentation for texlive-jmsdelim"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn62630"

RPM_NAME = "texlive-jmsdelim-doc-2023.209.0.0.2.0svn62630-56.1.noarch.rpm"
RPM_HASH = "11b073b89cc406c9f77b2c758ef5b220db2ec4738b9f9290bbb78bea8a709e4ed1f02071c6546bf3ac3ceaca618011d2d151aad1c0fe39d5a27a438fb43c4a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jmsdelim-doc"

RDEPENDS:${PN} += ""

inherit rpm
