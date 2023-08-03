SUMMARY = "Documentation for texlive-pst-optexp"
DESCRIPTION = "This package includes the documentation for texlive-pst-optexp"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1svn62977"

RPM_NAME = "texlive-pst-optexp-doc-2023.209.6.1svn62977-53.1.noarch.rpm"
RPM_HASH = "91ba3730251021f4dac3a16593febc3839633c797920ffdf782f54de45077a14f727d30ff377039411f96e5a7edcf1cf82dc4a05d11d7e40da79cd709abe3ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-optexp-doc-de;en \
texlive-pst-optexp-doc"

RDEPENDS:${PN} += ""

inherit rpm
