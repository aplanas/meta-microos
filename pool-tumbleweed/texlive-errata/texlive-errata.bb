SUMMARY = "Error markup for LaTeX documents"
DESCRIPTION = "This package provides a simple infrastructure for recording \
errata in LaTeX documents. This allows the user to maintain an \
updated version of the document (with all errors corrected) and \
to automatically generate an errata document highlighting the \
difference to the published version."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn42428"

RPM_NAME = "texlive-errata-2023.201.0.0.3svn42428-53.2.noarch.rpm"
RPM_HASH = "840bb01ab50dc5ced9e2ba3d9eec461c1d16dddf1cb6518d98deeed00f9fbcb0b88af2e1455fb8f685a01abbb39b924eff0cc756dd3f8e2b2cc46e83ecc523db"
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
