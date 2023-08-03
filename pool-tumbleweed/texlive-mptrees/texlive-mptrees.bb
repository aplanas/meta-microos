SUMMARY = "Probability trees with MetaPost"
DESCRIPTION = "This package provides MetaPost tools for drawing simple \
probability trees. One command and several parameters to \
control the output are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.21.11svn60929"

RPM_NAME = "texlive-mptrees-2023.209.21.11svn60929-55.1.noarch.rpm"
RPM_HASH = "416a329a69b012eee612f24a0252e51b2e52113e50030f7754a6783f851d2843765f42a120292bce9adbe7c71f6a4247268eae39cbbf133635db740a4c55dff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mptrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
