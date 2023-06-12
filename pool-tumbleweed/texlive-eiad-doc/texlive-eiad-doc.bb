SUMMARY = "Documentation for texlive-eiad"
DESCRIPTION = "This package includes the documentation for texlive-eiad"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-eiad-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "ddac1660d776730f5e615b4c10ebacb3756870521cf51ca8e5a75a98c957a73967f982e58c4088ed911552d2821189d5246742bf1ec1fe3947e453e986ae1026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-doc"
RDEPENDS:${PN} += ""

inherit rpm
