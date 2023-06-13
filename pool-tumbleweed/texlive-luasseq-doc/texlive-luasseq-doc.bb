SUMMARY = "Documentation for texlive-luasseq"
DESCRIPTION = "This package includes the documentation for texlive-luasseq"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65511"

RPM_NAME = "texlive-luasseq-doc-2023.201.svn65511-52.1.noarch.rpm"
RPM_HASH = "05107a953196c45587ddc1c484bb0762574d4945e9ec980a6a542bbefeaebb5d215316524fd822ba39e02528a53be198edb75d7ffd470d9b745cebedf70deca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luasseq-doc"

RDEPENDS:${PN} += ""

inherit rpm
