SUMMARY = "Documentation for texlive-ehhline"
DESCRIPTION = "This package includes the documentation for texlive-ehhline"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54676"

RPM_NAME = "texlive-ehhline-doc-2023.201.1.1svn54676-53.1.noarch.rpm"
RPM_HASH = "29b359698dd950aa3d71641c36ab39bfe0be046dd5bf7a54bfa225c8a082bef1564cf4a10fed737ae3b2cd2b2c4ab28e91df30fa59680e7488ad6c7c091e08d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ehhline-doc"

RDEPENDS:${PN} += ""

inherit rpm
