SUMMARY = "Documentation for texlive-cuprum"
DESCRIPTION = "This package includes the documentation for texlive-cuprum"
LICENSE = "OFL-1.1"

PV = "2023.209.svn49909"

RPM_NAME = "texlive-cuprum-doc-2023.209.svn49909-55.1.noarch.rpm"
RPM_HASH = "9e00b57a5b2641e2889a849d039fe575628c1ac446a81663d1b613b0c45cc145f2537c376837efd970c5386ad59e9b58789c50bfe28f447143c2cb3c851a450d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cuprum-doc"

RDEPENDS:${PN} += ""

inherit rpm
