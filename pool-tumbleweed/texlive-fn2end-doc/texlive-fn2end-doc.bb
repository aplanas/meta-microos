SUMMARY = "Documentation for texlive-fn2end"
DESCRIPTION = "This package includes the documentation for texlive-fn2end"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-fn2end-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "07fe2f9fef3daee1b4f83df4d056e1ceabeecde47d967a442bdb9d8c9aa82725c9daca0361b17fe3c11d103db37f9a34733555cec49232770d890f88811e0320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fn2end-doc"

RDEPENDS:${PN} += ""

inherit rpm
