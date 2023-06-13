SUMMARY = "Documentation for texlive-kastrup"
DESCRIPTION = "This package includes the documentation for texlive-kastrup"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-kastrup-doc-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "c754296e3984a4e6019a04c05d56adc073e5809af029dfd81430f9d4a2d5014308933ec19922ea4e9b028c2a836522d3c0a0f03bf8d1d799ddac45af3d7fde70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kastrup-doc"

RDEPENDS:${PN} += ""

inherit rpm
