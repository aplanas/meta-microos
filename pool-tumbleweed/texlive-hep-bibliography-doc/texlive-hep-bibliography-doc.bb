SUMMARY = "Documentation for texlive-hep-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-hep-bibliography"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-doc-2023.209.1.1svn64888-54.1.noarch.rpm"
RPM_HASH = "0ea3610c3046fd247806b538835b2842247d5038612af9e6dca6501e624b64bd10307f5211a1a5c16524e654adad99ed7000d89f2123df035af2c30625a9e1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
