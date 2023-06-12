SUMMARY = "Documentation for texlive-cns"
DESCRIPTION = "This package includes the documentation for texlive-cns"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.2.0svn45677"

RPM_NAME = "texlive-cns-doc-2023.201.4.2.0svn45677-53.1.noarch.rpm"
RPM_HASH = "00ce010a146b021e1c109c6b82fed278603d739b9a46192432a8facafb4e91499199e0c7de90312ac55b6700ecdc9879956a4f86a88ded856e4cc45641a248f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cns-doc"
RDEPENDS:${PN} += ""

inherit rpm
