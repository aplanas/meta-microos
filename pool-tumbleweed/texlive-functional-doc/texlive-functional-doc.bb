SUMMARY = "Documentation for texlive-functional"
DESCRIPTION = "This package includes the documentation for texlive-functional"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023asvn65485"

RPM_NAME = "texlive-functional-doc-2023.201.2023asvn65485-52.1.noarch.rpm"
RPM_HASH = "d130450c3f1a7a9273653dba373b5329d427142df773bce5ac387f5c5b7e8877609b1765b458ad7e0b8bc9212783362042ccd84872281f559e9f19120bd539d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-functional-doc"

RDEPENDS:${PN} += ""

inherit rpm
