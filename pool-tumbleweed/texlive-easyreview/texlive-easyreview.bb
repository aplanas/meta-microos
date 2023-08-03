SUMMARY = "Package to provide a way to review (or perform editorial process) in LaTeX"
DESCRIPTION = "The easyReview package provides a way to review (or perform \
editorial process) in LaTeX. You can use the provided commands \
to claim attention in different ways to part of the text, or \
even to indicate that a text was added, needs to be removed, \
needs to be replaced and add comments to the text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38352"

RPM_NAME = "texlive-easyreview-2023.209.1.0svn38352-54.1.noarch.rpm"
RPM_HASH = "a269905955d3fd9e38239d3307eaf522626463998fc7334ae2a36fe0bbdeb9ec3a6057daf52bb7865b4fa3fc5d6b714eca6eacba81c9987b76af12215185d967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyReview.sty \
texlive-easyreview"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
tex-todonotes.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
