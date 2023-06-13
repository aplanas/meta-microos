SUMMARY = "Documentation for texlive-jneurosci"
DESCRIPTION = "This package includes the documentation for texlive-jneurosci"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn17346"

RPM_NAME = "texlive-jneurosci-doc-2023.201.1.00svn17346-55.1.noarch.rpm"
RPM_HASH = "ede80099068a299336c291b89fd85c060f9da1128d3e3b18da26f8603ae588284762b9a7848049d0a8e1766747d6d62af7e7d6a35df999c305c6c4777af782d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jneurosci-doc"

RDEPENDS:${PN} += ""

inherit rpm
