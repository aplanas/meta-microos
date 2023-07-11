SUMMARY = "Documentation for texlive-marathi"
DESCRIPTION = "This package includes the documentation for texlive-marathi"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.7svn61719"

RPM_NAME = "texlive-marathi-doc-2023.208.1.7svn61719-53.1.noarch.rpm"
RPM_HASH = "a0954d2d20d30c0f22c7be9ec2d88a7b8a0f10069271156a7bed502212c90fc1b02380386c5c3c7e40024cd525c4be58b4b2e2b7f2db507dff7e483b55fac1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-marathi-doc-mr \
texlive-marathi-doc"

RDEPENDS:${PN} += ""

inherit rpm
