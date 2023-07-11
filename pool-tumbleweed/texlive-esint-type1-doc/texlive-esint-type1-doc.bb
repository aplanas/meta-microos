SUMMARY = "Documentation for texlive-esint-type1"
DESCRIPTION = "This package includes the documentation for texlive-esint-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-esint-type1-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "648249069820d30ea1bb5d4438e648ffce2db428307ba04afea7594ac36cac1b5ec9e16eb7a33b98ca11cc357c9a6fe44b036f30d5d9512782de8492e91df6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esint-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
