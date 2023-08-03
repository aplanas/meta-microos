SUMMARY = "Documentation for texlive-babel-icelandic"
DESCRIPTION = "This package includes the documentation for texlive-babel-icelandic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn51551"

RPM_NAME = "texlive-babel-icelandic-doc-2023.209.1.3svn51551-54.1.noarch.rpm"
RPM_HASH = "42a4c204c39859aaf2cc3d861e8507c4626a796fedb5abb5e1e14cde1f93e6bb3f1a9d88f002aad352d69a819f04d6a59f175b908b2ca684e00674aa6c5fcf08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-icelandic-doc"

RDEPENDS:${PN} += ""

inherit rpm
