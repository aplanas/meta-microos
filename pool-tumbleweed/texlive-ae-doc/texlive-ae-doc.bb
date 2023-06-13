SUMMARY = "Documentation for texlive-ae"
DESCRIPTION = "This package includes the documentation for texlive-ae"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn15878"

RPM_NAME = "texlive-ae-doc-2023.201.1.4svn15878-54.1.noarch.rpm"
RPM_HASH = "11ae3590524e17c50f1b56e3499cef2f819fd41d0d65b686a2cd3a974f98776dda7672a4cac3375b65011486004ef5903ac53b190d091812956d45000b6b59b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ae-doc"

RDEPENDS:${PN} += ""

inherit rpm
