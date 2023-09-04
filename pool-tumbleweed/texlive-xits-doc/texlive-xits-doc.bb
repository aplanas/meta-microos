SUMMARY = "Documentation for texlive-xits"
DESCRIPTION = "This package includes the documentation for texlive-xits"
LICENSE = "OFL-1.1"

PV = "2023.209.1.302svn55730"

RPM_NAME = "texlive-xits-doc-2023.209.1.302svn55730-53.2.noarch.rpm"
RPM_HASH = "d1640bf08215406b2548823f7e10ba34859cbf95802d77fd135d86db6e1148e287d94df7d34687416b1f9403c43b01bca1fd93db82c69988ba0e518039840882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits-doc"

RDEPENDS:${PN} += ""

inherit rpm
