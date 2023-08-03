SUMMARY = "University of California thesis format"
DESCRIPTION = "A modified version of the standard LaTeX report style that is \
accepted for use with University of California PhD \
dissertations and Masters theses. A sample dissertation source \
and bibliography are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn15878"

RPM_NAME = "texlive-ucthesis-2023.209.3.2svn15878-54.1.noarch.rpm"
RPM_HASH = "a7df78efc560637af9233078af7bd4023d130fe991af8ec30c8721453cb3032c86e5c758a61cb1df924614201022291ef920fb531e66636722c664ac101d1157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uct10.clo \
tex-uct11.clo \
tex-uct12.clo \
tex-ucthesis.cls \
texlive-ucthesis"

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
