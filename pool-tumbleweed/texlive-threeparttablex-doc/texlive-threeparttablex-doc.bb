SUMMARY = "Documentation for texlive-threeparttablex"
DESCRIPTION = "This package includes the documentation for texlive-threeparttablex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn34206"

RPM_NAME = "texlive-threeparttablex-doc-2023.209.0.0.3svn34206-55.1.noarch.rpm"
RPM_HASH = "9f03eff8b09485ca30dd70c502141d35a9f7e78e67416159deb22ada077cd73bf9c18171ffe8f697ab0194c2900d9b9de60f94cd4afb55729549fefed88a9171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeparttablex-doc"

RDEPENDS:${PN} += ""

inherit rpm
