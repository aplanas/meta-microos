SUMMARY = "Documentation for texlive-lebhart"
DESCRIPTION = "This package includes the documentation for texlive-lebhart"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-lebhart-doc-2023.201.svn65475-54.1.noarch.rpm"
RPM_HASH = "ce69992cc6454dea44e21727f9e46fd8a6a8645bb2766956c4a49f96962ab9a6b8aa17928912a9906b39a29b6a03ac08c798d742e8c9236725ebf0ddba8c2407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lebhart-doc"
RDEPENDS:${PN} += ""

inherit rpm
