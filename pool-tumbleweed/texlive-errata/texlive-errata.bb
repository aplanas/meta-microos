SUMMARY = "Error markup for LaTeX documents"
DESCRIPTION = "This package provides a simple infrastructure for recording \
errata in LaTeX documents. This allows the user to maintain an \
updated version of the document (with all errors corrected) and \
to automatically generate an errata document highlighting the \
difference to the published version."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn42428"

RPM_NAME = "texlive-errata-2023.209.0.0.3svn42428-54.1.noarch.rpm"
RPM_HASH = "e6acd92f6938282466290656488d68c0f6206a6dd7e1e8e1cbc58ce7f5de41187aa5f497e56ad462032220cfe0f3ce651945fcb37e057b5d1183e73b3d6ce565"
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
