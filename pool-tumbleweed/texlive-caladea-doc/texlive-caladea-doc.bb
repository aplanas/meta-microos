SUMMARY = "Documentation for texlive-caladea"
DESCRIPTION = "This package includes the documentation for texlive-caladea"
LICENSE = "Apache-1.0"

PV = "2023.201.svn64549"

RPM_NAME = "texlive-caladea-doc-2023.201.svn64549-52.1.noarch.rpm"
RPM_HASH = "5645658f66d6d0435ef4faae006be1b2ef7ea3ce14ca93b5423f2133e13a791a405d65e1e192e596c549b4fc510ebcdab0ebd1219f9cede68dce3de950e5e0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-caladea-doc"

RDEPENDS:${PN} += ""

inherit rpm
