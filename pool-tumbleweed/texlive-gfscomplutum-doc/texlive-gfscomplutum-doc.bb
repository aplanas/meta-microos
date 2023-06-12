SUMMARY = "Documentation for texlive-gfscomplutum"
DESCRIPTION = "This package includes the documentation for texlive-gfscomplutum"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn19469"

RPM_NAME = "texlive-gfscomplutum-doc-2023.201.1.0svn19469-52.1.noarch.rpm"
RPM_HASH = "14b1e7cd088d59d7534793e235834ab63d9d6ab45ae5846225d2fd9b2e2276a9692e42622dc51e2548296e945d44bbae78439db28f6bbb65df38b5e3a0e11da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfscomplutum-doc"
RDEPENDS:${PN} += ""

inherit rpm
