SUMMARY = "Documentation for texlive-bookmark"
DESCRIPTION = "This package includes the documentation for texlive-bookmark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.29svn56885"

RPM_NAME = "texlive-bookmark-doc-2023.209.1.29svn56885-53.1.noarch.rpm"
RPM_HASH = "aed2f888c08011e508e9cd86027b7bf3d0762a1e9fbfd9cd91e0771e9780d31ca3a7b7498b4bfcea38e824c864c9da3d0f16838f737dee8d4cc4466c1af36a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
