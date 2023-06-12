SUMMARY = "Documentation for texlive-splines"
DESCRIPTION = "This package includes the documentation for texlive-splines"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-splines-doc-2023.201.0.0.2svn15878-57.1.noarch.rpm"
RPM_HASH = "b523c81b25eb70d41a224c6a63e3d8e9202d93cc73a36206639f556a3f6ef2635931da15555adfeb2a3720ce9757571374f517bf0ee316a3a91a18c62506bb9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splines-doc"
RDEPENDS:${PN} += ""

inherit rpm
