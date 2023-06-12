SUMMARY = "Documentation for texlive-umich-thesis"
DESCRIPTION = "This package includes the documentation for texlive-umich-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn15878"

RPM_NAME = "texlive-umich-thesis-doc-2023.201.1.20svn15878-53.1.noarch.rpm"
RPM_HASH = "43f5dc929510ae706f32997ade6b58777e7ece15c1553dd4a1516d94a01e748c7563e971ae461a9b9c13daf90045e6d7e68f73d64347ae0f902f6e240395a272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umich-thesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
