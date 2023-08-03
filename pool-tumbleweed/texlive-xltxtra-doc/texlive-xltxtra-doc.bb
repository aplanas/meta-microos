SUMMARY = "Documentation for texlive-xltxtra"
DESCRIPTION = "This package includes the documentation for texlive-xltxtra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn56594"

RPM_NAME = "texlive-xltxtra-doc-2023.209.0.0.7svn56594-53.1.noarch.rpm"
RPM_HASH = "b19f516e5049486486354d6485e75cc9f30b23e0211e68562a5d1048c922f772bfed85d25e9501b8bbb7649ad0fb106313804e89dbc259b8b55bbc89765925f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltxtra-doc"

RDEPENDS:${PN} += ""

inherit rpm
