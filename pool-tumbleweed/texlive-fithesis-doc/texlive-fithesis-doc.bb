SUMMARY = "Documentation for texlive-fithesis"
DESCRIPTION = "This package includes the documentation for texlive-fithesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn64135"

RPM_NAME = "texlive-fithesis-doc-2023.201.1.1.0svn64135-52.1.noarch.rpm"
RPM_HASH = "585f5a019569b181ffc82645bf6e423b25ed5f487eee80b61729e3acf7e923cb9c8e1b5c3408245d95ea55a21f850da60c4fa0eb4ddf25209d42df87c46b4283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fithesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
