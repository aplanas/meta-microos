SUMMARY = "Documentation for texlive-varisize"
DESCRIPTION = "This package includes the documentation for texlive-varisize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-varisize-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "a8fbf4b263c23c01f355afd09df05cc1c3452cf28924e0f24d9d4b3eb3655c72d673e378dc58a438d70944736b1574447c8d7ab04d67b52c6305cd33cb50f971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varisize-doc"
RDEPENDS:${PN} += ""

inherit rpm
