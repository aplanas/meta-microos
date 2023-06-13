SUMMARY = "Documentation for texlive-jigsaw"
DESCRIPTION = "This package includes the documentation for texlive-jigsaw"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn66009"

RPM_NAME = "texlive-jigsaw-doc-2023.201.0.0.4svn66009-55.1.noarch.rpm"
RPM_HASH = "c822bcfee0534a90cc74992ce4e7708ecbdae410fa8dc55f3b66482e3c65a0705b5ecb240aa38838fffcc4074126ad65c68a4b76c1de0b99b610b1a5ca7416f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jigsaw-doc"

RDEPENDS:${PN} += ""

inherit rpm
