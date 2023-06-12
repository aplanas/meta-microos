SUMMARY = "Documentation for texlive-talk"
DESCRIPTION = "This package includes the documentation for texlive-talk"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42428"

RPM_NAME = "texlive-talk-doc-2023.201.1.1svn42428-54.1.noarch.rpm"
RPM_HASH = "b4fe83e52c911f8f63a5b47a6b545e4037421545e00e5a127febeefb5fe4d0bef156bd28839fbb27097f94444d66d97534acd9be1763d7366d00516825d459e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talk-doc"
RDEPENDS:${PN} += ""

inherit rpm
