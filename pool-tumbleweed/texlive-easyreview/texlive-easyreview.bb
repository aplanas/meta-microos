SUMMARY = "Package to provide a way to review (or perform editorial process) in LaTeX"
DESCRIPTION = "The easyReview package provides a way to review (or perform \
editorial process) in LaTeX. You can use the provided commands \
to claim attention in different ways to part of the text, or \
even to indicate that a text was added, needs to be removed, \
needs to be replaced and add comments to the text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn38352"

RPM_NAME = "texlive-easyreview-2023.201.1.0svn38352-53.1.noarch.rpm"
RPM_HASH = "c3ce2caa70fcc3908ed92fd4bc1facc8438e084dacf7691bbe51377afe83757a2be550b903c14a1bd9f6d94b064c48bc5b45746c44e38a199267cab0fe199255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyReview.sty \
texlive-easyreview"

RDEPENDS:${PN} += "/bin/sh \
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
