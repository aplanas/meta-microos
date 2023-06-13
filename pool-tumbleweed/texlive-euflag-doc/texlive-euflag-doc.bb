SUMMARY = "Documentation for texlive-euflag"
DESCRIPTION = "This package includes the documentation for texlive-euflag"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn55265"

RPM_NAME = "texlive-euflag-doc-2023.201.0.0.8svn55265-52.1.noarch.rpm"
RPM_HASH = "386ad171a2086596fa281d498c2b1d3c318e754dc76fb5c4f4871fa7d16620971211d1dcb38f446de1d9e87abcf7ccfe6e0804b00a2950c69909ff2c3c7e2425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euflag-doc"

RDEPENDS:${PN} += ""

inherit rpm
