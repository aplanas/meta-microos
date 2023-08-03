SUMMARY = "Documentation for texlive-l3packages"
DESCRIPTION = "This package includes the documentation for texlive-l3packages"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65722"

RPM_NAME = "texlive-l3packages-doc-2023.209.svn65722-56.1.noarch.rpm"
RPM_HASH = "73ffe87ff03220e7fd079e251dd549d06abe12cbd3b8801c2f48a225474db2ee022986119c9ce59e0e6dca411a0dcdb21e3ee5b0eec40c27b36613bbfaabbce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3packages-doc"

RDEPENDS:${PN} += ""

inherit rpm
