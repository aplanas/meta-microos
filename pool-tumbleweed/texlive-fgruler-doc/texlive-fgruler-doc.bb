SUMMARY = "Documentation for texlive-fgruler"
DESCRIPTION = "This package includes the documentation for texlive-fgruler"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn63721"

RPM_NAME = "texlive-fgruler-doc-2023.201.1.5svn63721-52.1.noarch.rpm"
RPM_HASH = "5b4c86b540d6f8dc3a54bc7d4dea51091e6a33670a0fb3f5c77c1765ff725250608e86d26cb2c7b56b900acb7077372c520f552fee2fbbf7d842ae083c480920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fgruler-doc"

RDEPENDS:${PN} += ""

inherit rpm
