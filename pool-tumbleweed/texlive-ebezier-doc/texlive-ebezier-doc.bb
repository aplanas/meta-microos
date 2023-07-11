SUMMARY = "Documentation for texlive-ebezier"
DESCRIPTION = "This package includes the documentation for texlive-ebezier"
LICENSE = "LPPL-1.0"

PV = "2023.201.4svn15878"

RPM_NAME = "texlive-ebezier-doc-2023.201.4svn15878-53.2.noarch.rpm"
RPM_HASH = "bb61ca84c13ea7bd91445b58b14cf0d9c80a95e3abefaa310f76fa97701e6931083d3779c3a1984f73ae51913b3bf18f9b33c0542ac993c1770ce49beb2e4536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebezier-doc"

RDEPENDS:${PN} += ""

inherit rpm
