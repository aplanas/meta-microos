SUMMARY = "Commented editions with LaTeX"
DESCRIPTION = "The package is intended for commented editions. An example of \
commented edition is a teacher's book based on a student's \
textbook. Each page of a teacher's book is a page from the \
textbook and comments for the teacher. This package was \
commissioned by Instituto de Matematica Pura e Aplicada ( IMPA)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn50116"

RPM_NAME = "texlive-commedit-2023.209.1.02svn50116-54.1.noarch.rpm"
RPM_HASH = "61422b679e11491c159615b9ea3e6169bbac87f05c399ed14799b14bd38f37debb846e74d9ce1553c89eb087093c28e88e8be8c2dd2e2259f1e43f53483ba008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commedit.sty \
texlive-commedit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changepage.sty \
tex-etoolbox.sty \
tex-everyshi.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
