SUMMARY = "Documentation for texlive-jmsdelim"
DESCRIPTION = "This package includes the documentation for texlive-jmsdelim"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn62630"

RPM_NAME = "texlive-jmsdelim-doc-2023.201.0.0.2.0svn62630-55.1.noarch.rpm"
RPM_HASH = "c3ab9d7303813735a260c85270f26e47fb983591f8a490994d35f08ff51599f33be5ecffa05b299839155b1518c7114dbd0b04a717325d5e7184e5dcc6a06d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jmsdelim-doc"
RDEPENDS:${PN} += ""

inherit rpm
