SUMMARY = "Documentation for texlive-dinat"
DESCRIPTION = "This package includes the documentation for texlive-dinat"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.5svn15878"

RPM_NAME = "texlive-dinat-doc-2023.209.2.5svn15878-53.1.noarch.rpm"
RPM_HASH = "67f1165943a047891147a04ab06dc75de037bc54014d01eb120cfbf52d56116d19b76ab4f876aca79eebf20e2dd63e137f3d2d921ec2ddef46d82c8938569911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dinat-doc-de \
texlive-dinat-doc"

RDEPENDS:${PN} += ""

inherit rpm
