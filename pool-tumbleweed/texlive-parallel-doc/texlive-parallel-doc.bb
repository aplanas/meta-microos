SUMMARY = "Documentation for texlive-parallel"
DESCRIPTION = "This package includes the documentation for texlive-parallel"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-parallel-doc-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "77c17436f6968f35de910f122888af5ffd0ab7d1c503530c1705739368de417c0868db8607f662332578a3ca4c37b9d19047baf57ed7ffb1eb78224139589a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parallel-doc"

RDEPENDS:${PN} += ""

inherit rpm
