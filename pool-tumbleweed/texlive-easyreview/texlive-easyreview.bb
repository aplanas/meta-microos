SUMMARY = "Package to provide a way to review (or perform editorial process) in LaTeX"
DESCRIPTION = "The easyReview package provides a way to review (or perform \
editorial process) in LaTeX. You can use the provided commands \
to claim attention in different ways to part of the text, or \
even to indicate that a text was added, needs to be removed, \
needs to be replaced and add comments to the text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38352"

RPM_NAME = "texlive-easyreview-2023.209.1.0svn38352-54.2.noarch.rpm"
RPM_HASH = "f330eaab75d568778a857e68e8f29e37152b7f6e27069339f9603f4019ac49d55fabbd50790f5216c5707985ad2bc46d52aede6fd485893c5c347788c284d203"
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
