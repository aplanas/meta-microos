SUMMARY = "Produce output similar to that of APJ"
DESCRIPTION = "A LaTeX class (based on current RevTeX) to produce preprints \
with the page layout similar to that of the Astrophysical \
Journal."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28469"

RPM_NAME = "texlive-emulateapj-2023.209.svn28469-54.1.noarch.rpm"
RPM_HASH = "9b1499b0f58c7382cf4e2867fce422c96351e6aed7b5a2215253503f11cfd4a17702e49d82fab04a4e4b6e701cfcc611f290625ed8ad3098c3ce13f7b370720d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emulateapj.cls \
texlive-emulateapj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-epsf.sty \
tex-graphicx.sty \
tex-latexsym.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
