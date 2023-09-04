SUMMARY = "Error markup for LaTeX documents"
DESCRIPTION = "This package provides a simple infrastructure for recording \
errata in LaTeX documents. This allows the user to maintain an \
updated version of the document (with all errors corrected) and \
to automatically generate an errata document highlighting the \
difference to the published version."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn42428"

RPM_NAME = "texlive-errata-2023.209.0.0.3svn42428-54.2.noarch.rpm"
RPM_HASH = "a046a4f5ff4d7c206efab6754eeb5bae09ac5ef7d3c388f32d228733b12019a68841eb1f5b6006fba39e55cc31a4354e078f07c12fe908f7dbc31df6959ae991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-errata.sty \
texlive-errata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
