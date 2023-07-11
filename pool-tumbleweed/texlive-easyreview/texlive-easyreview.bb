SUMMARY = "Package to provide a way to review (or perform editorial process) in LaTeX"
DESCRIPTION = "The easyReview package provides a way to review (or perform \
editorial process) in LaTeX. You can use the provided commands \
to claim attention in different ways to part of the text, or \
even to indicate that a text was added, needs to be removed, \
needs to be replaced and add comments to the text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn38352"

RPM_NAME = "texlive-easyreview-2023.201.1.0svn38352-53.2.noarch.rpm"
RPM_HASH = "15bf7f442b4f030bd01b107d2f8cd7643b5009efe6b4cfbf59f86a947855b1235acd781649fdbeb9b5be02cc897419039978224c691c191409ca5acd9f36abb5"
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
