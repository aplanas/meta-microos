SUMMARY = "Documentation for texlive-ed"
DESCRIPTION = "This package includes the documentation for texlive-ed"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn25231"

RPM_NAME = "texlive-ed-doc-2023.201.1.8svn25231-53.2.noarch.rpm"
RPM_HASH = "94ba712f31f18d99a0ed4a24aa4326a95bf89013c62e56a28764df542bd12da778bde0d847a29efa0167f8c3a47242490917b8f3a3b907bf26c62c00bdeddfc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ed-doc"

RDEPENDS:${PN} += ""

inherit rpm
