SUMMARY = "Documentation for texlive-numerica"
DESCRIPTION = "This package includes the documentation for texlive-numerica"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn61283"

RPM_NAME = "texlive-numerica-doc-2023.209.2.0.0svn61283-55.1.noarch.rpm"
RPM_HASH = "5c01ee4f6e6a92e9afb687935ea90faebd756ee09731176165e75406c1a88d813470687fec163931d949e711934075bbf31137326060f7a312b22b5b402d319a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-doc"

RDEPENDS:${PN} += ""

inherit rpm
