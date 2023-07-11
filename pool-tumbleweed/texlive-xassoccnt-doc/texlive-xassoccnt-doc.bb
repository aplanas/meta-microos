SUMMARY = "Documentation for texlive-xassoccnt"
DESCRIPTION = "This package includes the documentation for texlive-xassoccnt"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-doc-2023.201.2.0svn61112-52.2.noarch.rpm"
RPM_HASH = "04a91777f40d95263533927d731a264b19669b1315448e93ff657d3765b7acecc5af6cb55201c95257a30691a4f748bad4dc2deb4b9d7d5544c2206beb968353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xassoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
