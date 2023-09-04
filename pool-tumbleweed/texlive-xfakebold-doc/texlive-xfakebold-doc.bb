SUMMARY = "Documentation for texlive-xfakebold"
DESCRIPTION = "This package includes the documentation for texlive-xfakebold"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-doc-2023.209.0.0.08svn55654-53.2.noarch.rpm"
RPM_HASH = "ec6da8bd10dcbaba98d0785eea8375de470ce05ea793e88adf196920d167ce2828fcc411ba7788c2adafc627d606f552fa5f97f207b4c448e560818a2c5ee9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfakebold-doc"

RDEPENDS:${PN} += ""

inherit rpm
