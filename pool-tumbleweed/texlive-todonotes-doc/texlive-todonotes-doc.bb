SUMMARY = "Documentation for texlive-todonotes"
DESCRIPTION = "This package includes the documentation for texlive-todonotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.6svn65699"

RPM_NAME = "texlive-todonotes-doc-2023.209.1.1.6svn65699-53.1.noarch.rpm"
RPM_HASH = "ae1768938249680cf1fb3bb1108619d8fd3e8dd93cd941f9fc13435414d24b2e40230de97f27f9abcec321f9c7034256caa3edb3d5bfe4ac270e9a0e554cf5ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-todonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
