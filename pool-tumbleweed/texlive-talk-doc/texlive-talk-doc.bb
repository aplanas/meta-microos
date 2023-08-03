SUMMARY = "Documentation for texlive-talk"
DESCRIPTION = "This package includes the documentation for texlive-talk"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42428"

RPM_NAME = "texlive-talk-doc-2023.209.1.1svn42428-55.1.noarch.rpm"
RPM_HASH = "2d59d5d4fb1b4f53c29c5739f9650156e0238ff7056950ac6a9574e8a07849a605ed76acfedb2a76c0bc1bda20a4ca33b3a7be0eb4470298f6a5f529d817ff18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talk-doc"

RDEPENDS:${PN} += ""

inherit rpm
