SUMMARY = "Documentation for texlive-forum"
DESCRIPTION = "This package includes the documentation for texlive-forum"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64566"

RPM_NAME = "texlive-forum-doc-2023.209.svn64566-53.1.noarch.rpm"
RPM_HASH = "1ca9b988196590ad266736b8de59c970e39f85055c4c4eb8eb882644d8d932f2aaebb52ae1f476e935d9ab6be28dc821d44c79848e042c03f322da04d13a4532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forum-doc"

RDEPENDS:${PN} += ""

inherit rpm
