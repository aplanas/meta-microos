SUMMARY = "Documentation for texlive-afthesis"
DESCRIPTION = "This package includes the documentation for texlive-afthesis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.7svn15878"

RPM_NAME = "texlive-afthesis-doc-2023.201.2.7svn15878-54.1.noarch.rpm"
RPM_HASH = "e487bbf3b09fa08f13fd26f1fd0e9cedbd0a5163a4c6a29d49986d6128d568208232ef9204b229553723a0c894d776cc9ba419c66da6fd6a56a931786d4d6f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-afthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
