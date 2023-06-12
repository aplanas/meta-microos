SUMMARY = "Documentation for texlive-algorithms"
DESCRIPTION = "This package includes the documentation for texlive-algorithms"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.0.0.1svn42428"

RPM_NAME = "texlive-algorithms-doc-2023.201.0.0.1svn42428-54.1.noarch.rpm"
RPM_HASH = "e2b7b8842e52d9fa2cab6f8245e166a630bb06a8574e25971485d437f60aac4d1d20fe6cb5d14b73410c6dd5a66725e199874540d3e089f137cd63111c47332f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-algorithms-doc:en) \
texlive-algorithms-doc"
RDEPENDS:${PN} += ""

inherit rpm
