SUMMARY = "Documentation for texlive-bxjaholiday"
DESCRIPTION = "This package includes the documentation for texlive-bxjaholiday"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn60636"

RPM_NAME = "texlive-bxjaholiday-doc-2023.201.1.1.1svn60636-52.1.noarch.rpm"
RPM_HASH = "2d6642f3aa6677ffd0c2403f6d68d7072708389f00b00ff2e9af65224bc6793c67d9346794906f5787d4699b81701f14ebee91757878cd48b4a6c91f3bb83729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bxjaholiday-doc:ja) \
texlive-bxjaholiday-doc"
RDEPENDS:${PN} += ""

inherit rpm
