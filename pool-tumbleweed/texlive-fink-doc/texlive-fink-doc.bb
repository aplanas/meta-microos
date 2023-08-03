SUMMARY = "Documentation for texlive-fink"
DESCRIPTION = "This package includes the documentation for texlive-fink"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn24329"

RPM_NAME = "texlive-fink-doc-2023.209.2.2.1svn24329-53.1.noarch.rpm"
RPM_HASH = "5558ad75a54e77705ffed7db4a836a58ed1495a72cd78b16783824bd8c0a38f2c960237798ddc365718b247000e5f04422ac5799789dbddf81819154af9a7110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fink-doc"

RDEPENDS:${PN} += ""

inherit rpm
