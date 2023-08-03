SUMMARY = "Documentation for texlive-embedfile"
DESCRIPTION = "This package includes the documentation for texlive-embedfile"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn65528"

RPM_NAME = "texlive-embedfile-doc-2023.209.2.12svn65528-54.1.noarch.rpm"
RPM_HASH = "f396b69343c13c5053ed31c469616e69835fc90ae0f3b18fda5267082c97f25ab4b66cab476f38fa57f4b9ddf9c73c695eabad9990d93a219a2ce720cd05f88e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
