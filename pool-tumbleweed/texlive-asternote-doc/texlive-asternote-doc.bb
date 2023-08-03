SUMMARY = "Documentation for texlive-asternote"
DESCRIPTION = "This package includes the documentation for texlive-asternote"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63838"

RPM_NAME = "texlive-asternote-doc-2023.209.1.1svn63838-54.1.noarch.rpm"
RPM_HASH = "6e4320a5ef2b7e354a3f33e8134347d1a3ed97423ca900c09d64717d3df5679fc28c18e8595041d71c09fe0125c920bb9e2247af7778de3017256c787b183e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-asternote-doc-en \
texlive-asternote-doc"

RDEPENDS:${PN} += ""

inherit rpm
