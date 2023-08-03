SUMMARY = "Documentation for texlive-subeqn"
DESCRIPTION = "This package includes the documentation for texlive-subeqn"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn15878"

RPM_NAME = "texlive-subeqn-doc-2023.209.2.0bsvn15878-58.1.noarch.rpm"
RPM_HASH = "a27f21c831a4fbd39b756da416e969e62b054b451a55efcf95a35692dcc373405bdabaa5844b07bc29dd412106cb4795f341a758504bb10da14e23ea2b580d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subeqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
