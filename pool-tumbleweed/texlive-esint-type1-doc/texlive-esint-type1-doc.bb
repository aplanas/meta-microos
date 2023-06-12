SUMMARY = "Documentation for texlive-esint-type1"
DESCRIPTION = "This package includes the documentation for texlive-esint-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-esint-type1-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "168e3484005f79bead3e0719702e9bfeb4694d2449582ff9952c72c84edd3541149d9b03d1f31f7867a48f6bb9699bbc548fbfca3dd6db231dcc09512328af60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-type1-doc"
RDEPENDS:${PN} += ""

inherit rpm
