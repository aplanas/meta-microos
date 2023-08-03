SUMMARY = "A LaTeX course book"
DESCRIPTION = "The package provides the book and practice files for a LaTeX \
course that the author has give several times at the \
Rijksuniversiteit Groningen (Netherlands)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn39026"

RPM_NAME = "texlive-latexcourse-rug-2023.209.1.1svn39026-55.1.noarch.rpm"
RPM_HASH = "77964236716f1e0568f46f2e2947a7fad07d1cf84fdf0fa27ce404ad8692aa5c45082ba528a46346b6fcb27e239c5dde6a5c45468da1daf922ec0ba0ef176cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcourse-rug"

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
