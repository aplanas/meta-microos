SUMMARY = "Documentation for texlive-frletter"
DESCRIPTION = "This package includes the documentation for texlive-frletter"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-frletter-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "0af0de39b6faef337864255a29348f267d874b402f3b7d49883b9d08a2c5270c2a45d0c65342c5bb74a9a0e63648208756b8b2ff57b7a8e57d66409bc8123d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
