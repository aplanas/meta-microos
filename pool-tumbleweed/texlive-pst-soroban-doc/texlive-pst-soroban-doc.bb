SUMMARY = "Documentation for texlive-pst-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pst-soroban"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "7727a67e97dc5b7db7d90d714103dc94104fbb99a5194d6d2c81e01cf30c66e6187f681f04dbb429f17551f44fc3316b0c0b14e7930caf655211f4ffdd16279a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-soroban-doc"

RDEPENDS:${PN} += ""

inherit rpm
