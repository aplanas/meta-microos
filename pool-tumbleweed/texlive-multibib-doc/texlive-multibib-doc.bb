SUMMARY = "Documentation for texlive-multibib"
DESCRIPTION = "This package includes the documentation for texlive-multibib"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-multibib-doc-2023.209.1.4svn15878-55.1.noarch.rpm"
RPM_HASH = "ec0535cf1b5d05ae16f85a2a3ffdfa064ef37f9a22e25fa8db248806d4d679d509772a623396280f0bf39507a33138f9ec5bc937884f70978d0f151952ad3343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibib-doc"

RDEPENDS:${PN} += ""

inherit rpm
