SUMMARY = "LaTeX Math for Undergraduates cheat sheet"
DESCRIPTION = "This is a cheat sheet for writing mathematics with LaTeX. It is \
aimed at US undergraduates."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57286"

RPM_NAME = "texlive-undergradmath-2023.209.svn57286-54.1.noarch.rpm"
RPM_HASH = "eb5c487a37f857e1968b3743172604d811bd4949d655c1d43c09ba15aaf7a01af10755f1b65c30151e7a601af45a3f354e8dd2cfed02daa1dbb6c60cc0fa48a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-undergradmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
