SUMMARY = "Documentation for texlive-onrannual"
DESCRIPTION = "This package includes the documentation for texlive-onrannual"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn17474"

RPM_NAME = "texlive-onrannual-doc-2023.209.1.1svn17474-55.1.noarch.rpm"
RPM_HASH = "f3c8d1f275bb4e4e64ece51bc68f96b566a54fa8977cbf5874bb4337e3a9d35555afae1a9e063260d019a9b205cf79c38849d342293133729f07e4cb922d61b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onrannual-doc"

RDEPENDS:${PN} += ""

inherit rpm
