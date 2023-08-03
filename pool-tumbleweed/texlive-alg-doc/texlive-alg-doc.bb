SUMMARY = "Documentation for texlive-alg"
DESCRIPTION = "This package includes the documentation for texlive-alg"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-alg-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "b4c7c212c1108aa4d00778cc956e69d0a907dce7c6945c91ca7b3b688d50b99776123fc6993c1d6375024609ff3129997fcbc7afd4cdc2fe431351fe564b1798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alg-doc"

RDEPENDS:${PN} += ""

inherit rpm
