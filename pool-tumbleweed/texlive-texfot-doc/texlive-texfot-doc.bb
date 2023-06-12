SUMMARY = "Documentation for texlive-texfot"
DESCRIPTION = "This package includes the documentation for texlive-texfot"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.48svn65545"

RPM_NAME = "texlive-texfot-doc-2023.201.1.48svn65545-54.1.noarch.rpm"
RPM_HASH = "30567a8a5a207344f9b95aa970a8e8258e47566708acd97dd8c9ba22786e654cdfe42c16fcb3a09535601ff755108f249b6f2966514d9118a52c62c258fb7935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(texfot.1) \
texlive-texfot-doc"
RDEPENDS:${PN} += ""

inherit rpm
