SUMMARY = "Error markup for LaTeX documents"
DESCRIPTION = "This package provides a simple infrastructure for recording \
errata in LaTeX documents. This allows the user to maintain an \
updated version of the document (with all errors corrected) and \
to automatically generate an errata document highlighting the \
difference to the published version."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn42428"

RPM_NAME = "texlive-errata-2023.201.0.0.3svn42428-53.1.noarch.rpm"
RPM_HASH = "25ac7bb9d0a5209b1636dd5f6eb530ca268d04daf54f79ebf21bc571662b5eeacd9ff89f9414a6304565e418e7fd7d43686a7f693db37f51d68d468b8379fb00"
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
