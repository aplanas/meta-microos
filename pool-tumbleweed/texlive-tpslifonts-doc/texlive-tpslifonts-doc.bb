SUMMARY = "Documentation for texlive-tpslifonts"
DESCRIPTION = "This package includes the documentation for texlive-tpslifonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6svn42428"

RPM_NAME = "texlive-tpslifonts-doc-2023.201.0.0.6svn42428-52.1.noarch.rpm"
RPM_HASH = "c7f67856a785dddd97765d17faa679215cb700ebec0fec69fe5710b9ee6416a8022d24e09520e739f4dd2df8c30130605560b454284c541ed3ba6a886a39423a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tpslifonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
