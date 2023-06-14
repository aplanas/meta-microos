SUMMARY = "Documentation for texlive-tabriz-thesis"
DESCRIPTION = "This package includes the documentation for texlive-tabriz-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51729"

RPM_NAME = "texlive-tabriz-thesis-doc-2023.201.1.1svn51729-54.1.noarch.rpm"
RPM_HASH = "379db301430d78146ddd8d4fcff15151168d0ec8e2949685646d81aebd65aa32cb20e96c504a42740ae1bab61e0b74e61e410f17550f5287e2469816dd3b67d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabriz-thesis-doc-fa \
texlive-tabriz-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
