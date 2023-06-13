SUMMARY = "Documentation for texlive-formular"
DESCRIPTION = "This package includes the documentation for texlive-formular"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-formular-doc-2023.201.1.0asvn15878-52.1.noarch.rpm"
RPM_HASH = "cbfaaf51b1982f63bf584c547b7fecd64e4f1aa20be6064669054901862bbc1fba782c01019cc2eb626b154213d5a617992265f98b5a6573266fb6697ddbb98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formular-doc"

RDEPENDS:${PN} += ""

inherit rpm
