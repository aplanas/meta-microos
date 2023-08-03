SUMMARY = "Documentation for texlive-pbalance"
DESCRIPTION = "This package includes the documentation for texlive-pbalance"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn64002"

RPM_NAME = "texlive-pbalance-doc-2023.209.1.4.0svn64002-52.1.noarch.rpm"
RPM_HASH = "6e27eebd94a2ad7708ad011d16fc57166582afd009c5e19f9b31f932c56ebc1daf3b2fb27d66bb242ba05202091044c2c87752b67e849e7f7486ea126f697d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbalance-doc"

RDEPENDS:${PN} += ""

inherit rpm
