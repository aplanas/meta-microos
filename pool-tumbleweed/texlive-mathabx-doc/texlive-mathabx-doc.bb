SUMMARY = "Documentation for texlive-mathabx"
DESCRIPTION = "This package includes the documentation for texlive-mathabx"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-mathabx-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "d2aba016c62f1bf385a5de5718fc726e3a5e7c9a497417660ba03eed3f2d40df658552b85b3887a1281b1bc1d393ca3cfa476bf038c6f280973943e14f5f5862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathabx-doc"

RDEPENDS:${PN} += ""

inherit rpm
