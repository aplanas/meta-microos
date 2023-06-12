SUMMARY = "Documentation for texlive-hyplain"
DESCRIPTION = "This package includes the documentation for texlive-hyplain"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hyplain-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "d75612a115e1872a724d84a616b15d5c811ef6ae64bad6307027a80a26038985df8be4b8fd7ea77b17a8711e873f344fe92e2876e9402908cb87f485f40a0d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyplain-doc"
RDEPENDS:${PN} += ""

inherit rpm
