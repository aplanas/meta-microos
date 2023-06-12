SUMMARY = "Documentation for texlive-pxjahyper"
DESCRIPTION = "This package includes the documentation for texlive-pxjahyper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-doc-2023.201.1.3svn66272-53.1.noarch.rpm"
RPM_HASH = "8f0c0b3c5d035d4282f1e9e6dfaec91bf8757231fda76520e2cccad3af785ddeb505d551f053e97e21c4eb5f74475ca5d71194719bbb208e23ecf667dd24cd10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pxjahyper-doc:ja) \
texlive-pxjahyper-doc"
RDEPENDS:${PN} += ""

inherit rpm
