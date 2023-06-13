SUMMARY = "Documentation for texlive-anysize"
DESCRIPTION = "This package includes the documentation for texlive-anysize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-anysize-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "e84b07c5733ce94c61f44120b397033d58a1c71f36fbc665db711e37e20a674a5718fc06c2b1b22fd49f7ea86228f591941c2b11aa58d3a65f59f8c0acf30a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anysize-doc"

RDEPENDS:${PN} += ""

inherit rpm
