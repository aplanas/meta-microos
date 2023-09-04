SUMMARY = "Documentation for texlive-xargs"
DESCRIPTION = "This package includes the documentation for texlive-xargs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-xargs-doc-2023.209.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "244d7b03351be607796a4ca300152c8d8976beb67e44e11c333c46f6d06910da17fd6a08c3324759b5a87b8f438a24414e8af4c98b412384e97444fc88fc986d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xargs-doc-fr;en \
texlive-xargs-doc"

RDEPENDS:${PN} += ""

inherit rpm
