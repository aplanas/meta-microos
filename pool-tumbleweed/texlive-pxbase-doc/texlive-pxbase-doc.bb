SUMMARY = "Documentation for texlive-pxbase"
DESCRIPTION = "This package includes the documentation for texlive-pxbase"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn66187"

RPM_NAME = "texlive-pxbase-doc-2023.201.1.4svn66187-53.1.noarch.rpm"
RPM_HASH = "b5fcd87f18dd5ebaeda2657b2184a6d2dcb2c6e6b3cf25432985799e624b1a5a96cd5d3f1a0e7dc46b62273093b0d7bc7afa7076f5c8720edbaf012d9b739358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pxbase-doc:ja) \
texlive-pxbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
