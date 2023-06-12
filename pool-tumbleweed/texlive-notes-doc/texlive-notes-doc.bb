SUMMARY = "Documentation for texlive-notes"
DESCRIPTION = "This package includes the documentation for texlive-notes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn42428"

RPM_NAME = "texlive-notes-doc-2023.201.1.0.1svn42428-54.1.noarch.rpm"
RPM_HASH = "b95f9b40b882b78a5f816c42f853a88062e7eb1cfb9f7ddf6c29c851f2dd8d98369aeac9306cb9b807cb56463598e3aa72a0ef41c6a2f2ef33d1c5cf530b6f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notes-doc"
RDEPENDS:${PN} += ""

inherit rpm
