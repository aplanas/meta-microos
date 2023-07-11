SUMMARY = "Documentation for texlive-lstfiracode"
DESCRIPTION = "This package includes the documentation for texlive-lstfiracode"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1csvn49503"

RPM_NAME = "texlive-lstfiracode-doc-2023.208.0.0.1csvn49503-53.1.noarch.rpm"
RPM_HASH = "1a03af0ba87190c071d1075b1f54af5c1ff9adc64bed62453d4c5bc754e973f84f69ea9a54ddfe69ec2def9160e14d27ad614682099f8bbadb823bb0310410e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstfiracode-doc"

RDEPENDS:${PN} += ""

inherit rpm
