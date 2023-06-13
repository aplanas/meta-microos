SUMMARY = "Documentation for texlive-shuffle"
DESCRIPTION = "This package includes the documentation for texlive-shuffle"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-shuffle-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "07ee1750650635047a4c0e1dba74c37ac5bd0aad352bc6267158fc89ee47ceef45e37072e8e4ce55a18895371f2516cbe1292b1a106e4a205f7288e11afe123f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shuffle-doc"

RDEPENDS:${PN} += ""

inherit rpm
