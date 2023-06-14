SUMMARY = "Documentation for texlive-musixtnt"
DESCRIPTION = "This package includes the documentation for texlive-musixtnt"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn40307"

RPM_NAME = "texlive-musixtnt-doc-2023.201.svn40307-54.1.noarch.rpm"
RPM_HASH = "3f88b1a3475e0441346b5552bccaa7175c40dcc20382c7dc38c3f2de4a9881ca0e965b7aab6f299b84eecbe9cd02d6d47bdd13b25174ae0ef43912a896e3cfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-msxlint.1 \
texlive-musixtnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
