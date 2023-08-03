SUMMARY = "Prepare papers for the journal Nature"
DESCRIPTION = "Nature does not accept papers in LaTeX, but it does accept PDF. \
This class and BibTeX style provide what seems to be necessary \
to produce papers in a format acceptable to the publisher."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21819"

RPM_NAME = "texlive-nature-2023.209.1.0svn21819-55.1.noarch.rpm"
RPM_HASH = "a77c2669868fca5aacb2793b8bcce3c0eb859d2081d35e9bc5ee71a7384a3e11844b186ef9b3d8b27aae9e123f21616283af22a6342662c6109fec6a634adbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nature.cls \
texlive-nature"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-cite.sty \
tex-fullpage.sty \
tex-ifthen.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
