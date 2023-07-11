SUMMARY = "Documentation for texlive-erdc"
DESCRIPTION = "This package includes the documentation for texlive-erdc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-erdc-doc-2023.201.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "a901e4a000202167a021fae9c34275f04abe519362721ba5a8967f3e435df22c3e1fcfb2bdf21ecf49064053f997d38421944505a8affec7b6cd994312114c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erdc-doc"

RDEPENDS:${PN} += ""

inherit rpm
