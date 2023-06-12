SUMMARY = "Documentation for texlive-cfr-lm"
DESCRIPTION = "This package includes the documentation for texlive-cfr-lm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn36195"

RPM_NAME = "texlive-cfr-lm-doc-2023.201.1.5svn36195-52.1.noarch.rpm"
RPM_HASH = "39650887721ec99a77ac9fc4e55368b89596e4b0c489b9bf7f61f7cbcb7718231ec0be9a125ad6c262662d089b97b93a159091ea286764c56999a7cd38eb61ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cfr-lm-doc"
RDEPENDS:${PN} += ""

inherit rpm
