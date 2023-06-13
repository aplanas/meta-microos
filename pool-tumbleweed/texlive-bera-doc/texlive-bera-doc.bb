SUMMARY = "Documentation for texlive-bera"
DESCRIPTION = "This package includes the documentation for texlive-bera"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20031"

RPM_NAME = "texlive-bera-doc-2023.201.svn20031-53.1.noarch.rpm"
RPM_HASH = "64f8871d955ae85b2f114d3b075f54db6f4c44900dd983d2f9d33fec6246d82a4c3fc57be8f4b64b151776f1885f6a9e136c8f79534ffcc024fc3bf8b6cdf005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bera-doc"

RDEPENDS:${PN} += ""

inherit rpm
