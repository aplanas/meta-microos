SUMMARY = "Documentation for texlive-esint-type1"
DESCRIPTION = "This package includes the documentation for texlive-esint-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-esint-type1-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "4509f3b952bd271ca372bc9655c6161e34edeb34fefaf7d285985f2a5913100b051d574f84a03a3fbc3466c631222043c818a64553570029475c9941858cbdc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
