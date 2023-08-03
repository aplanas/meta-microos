SUMMARY = "Documentation for texlive-pst-node"
DESCRIPTION = "This package includes the documentation for texlive-pst-node"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.43svn61838"

RPM_NAME = "texlive-pst-node-doc-2023.209.1.43svn61838-53.1.noarch.rpm"
RPM_HASH = "5c76db9f3b7168825d7310c25bba36823d9d07ac543a99eedbb25a05947891b03ea020eab7cb48870050e756c1f5d5e53ec159b761ec3485c4315123f633d657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-node-doc-en \
texlive-pst-node-doc"

RDEPENDS:${PN} += ""

inherit rpm
