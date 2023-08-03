SUMMARY = "Documentation for texlive-show2e"
DESCRIPTION = "This package includes the documentation for texlive-show2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-show2e-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "7b46561bc1be950e20377523d0b616369c4548ff5e645a757f1f5e9ecdf8f6489dfaa4bbf81b1ec0ef346c153c3c1cbb9ec2738ae1c3a8751c2100a90260fd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-show2e-doc-fr;en \
texlive-show2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
