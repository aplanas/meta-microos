SUMMARY = "Documentation for texlive-metapost"
DESCRIPTION = "This package includes the documentation for texlive-metapost"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.svn66264"

RPM_NAME = "texlive-metapost-doc-2023.209.svn66264-55.1.noarch.rpm"
RPM_HASH = "2eabafdcdce04c17817cd48c893fe0175415c39daffeace3f7f30a17556eed60f843a4b4f05a7c06b4ff9b6346fc6fc22bc12bb891d98637e3bd1e9b19739f94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvitomp.1 \
man-mpost.1 \
texlive-metapost-doc"

RDEPENDS:${PN} += ""

inherit rpm
