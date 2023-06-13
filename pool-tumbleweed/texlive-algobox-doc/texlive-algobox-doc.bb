SUMMARY = "Documentation for texlive-algobox"
DESCRIPTION = "This package includes the documentation for texlive-algobox"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn52204"

RPM_NAME = "texlive-algobox-doc-2023.201.1.3svn52204-54.1.noarch.rpm"
RPM_HASH = "89b4d0c8a1700a240e3695cc4588e343257fa13073afb3908041c08602271eb5af9c3faae99cd7cf16d1221caa06afbc97cc62d75bc4b404db3f23844eb07aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algobox-doc"

RDEPENDS:${PN} += ""

inherit rpm
