SUMMARY = "Documentation for texlive-cuprum"
DESCRIPTION = "This package includes the documentation for texlive-cuprum"
LICENSE = "OFL-1.1"

PV = "2023.204.svn49909"

RPM_NAME = "texlive-cuprum-doc-2023.204.svn49909-54.1.noarch.rpm"
RPM_HASH = "344b5930e761ae0700bc52c0f35c41f4fdc6ee98fd98efd8a87d0ada3c2f4805bb64a645e7ee8df85bb725060c843e54318c0b7d1027a6d2a9e09593c520b65c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cuprum-doc"
RDEPENDS:${PN} += ""

inherit rpm
