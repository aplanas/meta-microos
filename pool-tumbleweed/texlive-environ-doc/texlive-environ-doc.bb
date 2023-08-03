SUMMARY = "Documentation for texlive-environ"
DESCRIPTION = "This package includes the documentation for texlive-environ"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn56615"

RPM_NAME = "texlive-environ-doc-2023.209.0.0.3svn56615-54.1.noarch.rpm"
RPM_HASH = "a378bff2d54eb56c2dd6604a99049076262263e81570b16aabc0732866bf3df812cee9dcbb919f37860f48dfbeed2a8ce119e9e862b1ed3a22d0f13226622d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-environ-doc"

RDEPENDS:${PN} += ""

inherit rpm
