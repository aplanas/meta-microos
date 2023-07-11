SUMMARY = "Documentation for texlive-graphicscache"
DESCRIPTION = "This package includes the documentation for texlive-graphicscache"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.4svn65318"

RPM_NAME = "texlive-graphicscache-doc-2023.201.0.0.4svn65318-53.2.noarch.rpm"
RPM_HASH = "313d8fe086ce29ead703bb2fa9abf0491b89b3c89499e6f2a331d167a6b6988e42ea3ca80ce454f6061d02f44be75aeab5cbff43f6408629bb35be117338300d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicscache-doc"

RDEPENDS:${PN} += ""

inherit rpm
