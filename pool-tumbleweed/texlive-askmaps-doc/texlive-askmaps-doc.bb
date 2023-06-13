SUMMARY = "Documentation for texlive-askmaps"
DESCRIPTION = "This package includes the documentation for texlive-askmaps"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn56730"

RPM_NAME = "texlive-askmaps-doc-2023.201.0.0.2svn56730-53.1.noarch.rpm"
RPM_HASH = "2942066268d14ac69c5c4a66295edeae2268f96076493a53b80c6384df4024895734ef47af1a14d49631184594c63469569329d8d78deddc6f7e6494165dd876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-askmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
