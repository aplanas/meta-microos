SUMMARY = "Documentation for texlive-latino-sine-flexione"
DESCRIPTION = "This package includes the documentation for texlive-latino-sine-flexione"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn53485"

RPM_NAME = "texlive-latino-sine-flexione-doc-2023.209.1.2svn53485-55.1.noarch.rpm"
RPM_HASH = "30cd32bc1112d6dc1d784141203e1ae8d12e02a4c206ae83d94bac15764f3430772bc6c5e69a272ce73a56a1aa7dc3ee36a23b55a82f2290498c964ab51732be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latino-sine-flexione-doc"

RDEPENDS:${PN} += ""

inherit rpm
