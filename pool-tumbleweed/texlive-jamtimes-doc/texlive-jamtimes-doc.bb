SUMMARY = "Documentation for texlive-jamtimes"
DESCRIPTION = "This package includes the documentation for texlive-jamtimes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn20408"

RPM_NAME = "texlive-jamtimes-doc-2023.201.1.12svn20408-55.1.noarch.rpm"
RPM_HASH = "1b9717936a27c46f096072a4595493e20caec66f7e59e44d4e082ab75e27e2eeac9c324ae94a6f78ba053a5dba9321c32c4bf273a6e6ef3bdb1e065c129d07f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jamtimes-doc"

RDEPENDS:${PN} += ""

inherit rpm
