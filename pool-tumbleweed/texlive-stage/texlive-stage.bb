SUMMARY = "A LaTeX class for stage plays"
DESCRIPTION = "Stage.cls is a LaTeX class for creating plays of any length in \
a standard manuscript format for production and submission."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn62929"

RPM_NAME = "texlive-stage-2023.209.1.03svn62929-58.1.noarch.rpm"
RPM_HASH = "afdf57e9a4ab9c73328aa50a81a4c2abe7c974a783012f5dbe235387bf28270dee792577316bc3cdcb8af5957cf7a202ad25867e5680df377a3d434cdec6ead6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stage.cls \
texlive-stage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-changepage.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-needspace.sty \
tex-parskip.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
