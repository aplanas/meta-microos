SUMMARY = "Documentation for texlive-hagenberg-thesis"
DESCRIPTION = "This package includes the documentation for texlive-hagenberg-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65819"

RPM_NAME = "texlive-hagenberg-thesis-doc-2023.209.svn65819-54.1.noarch.rpm"
RPM_HASH = "2cffac6d7b3029a242a47b9d1412c03575bfa0c3b4c2458b3dc68a1ab6ecebc6b5cc2805e376095fbdc69af45689710ada7e6e6ad6df9fa8ba6114f09b8c5b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hagenberg-thesis-doc-de;en \
texlive-hagenberg-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
