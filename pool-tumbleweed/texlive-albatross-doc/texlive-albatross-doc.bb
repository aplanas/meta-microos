SUMMARY = "Documentation for texlive-albatross"
DESCRIPTION = "This package includes the documentation for texlive-albatross"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.5.0svn65647"

RPM_NAME = "texlive-albatross-doc-2023.209.0.0.5.0svn65647-55.1.noarch.rpm"
RPM_HASH = "8c3d0d881da7e3fb98776f3a42a77a9da5ac3caa5c5abd53c494f314ca9125fd8e960269c555651fea13c82400190644314996783e1684123b75594ecbdb6d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-albatross.1 \
texlive-albatross-doc"

RDEPENDS:${PN} += ""

inherit rpm
