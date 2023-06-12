SUMMARY = "Documentation for texlive-pstring"
DESCRIPTION = "This package includes the documentation for texlive-pstring"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn42857"

RPM_NAME = "texlive-pstring-doc-2023.201.svn42857-53.1.noarch.rpm"
RPM_HASH = "9db2949883d4a90051c5eac03c86ba4cee4db2c2e35ce68fa16406515b221c8313a12478ceb48a0379212c3eff0ecc6273357bf429ea1bb83ac8cd03c3a440e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstring-doc"
RDEPENDS:${PN} += ""

inherit rpm
