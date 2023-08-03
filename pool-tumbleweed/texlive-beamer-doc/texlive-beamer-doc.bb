SUMMARY = "Documentation for texlive-beamer"
DESCRIPTION = "This package includes the documentation for texlive-beamer"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.69svn65984"

RPM_NAME = "texlive-beamer-doc-2023.209.3.69svn65984-54.1.noarch.rpm"
RPM_HASH = "56b986d112939c3353dfee5991b34e10b308e38f825c06512e117dc840d9ff60c52a66ffff21f36675f3a5ec19f2a7c696a54bdba17439f1651670c034b443f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
