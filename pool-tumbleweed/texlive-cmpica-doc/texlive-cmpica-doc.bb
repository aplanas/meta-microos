SUMMARY = "Documentation for texlive-cmpica"
DESCRIPTION = "This package includes the documentation for texlive-cmpica"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-cmpica-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "0a0024012577ca775eca133fe50cfad14f522e1eba68f2d30c6f46a7524127b16dc0ca461513208049cd56ef464967be37b4cc8ea81a737c2bab0cbe24b9a504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmpica-doc"

RDEPENDS:${PN} += ""

inherit rpm
