SUMMARY = "BibTeX style for the Journal of Neuroscience"
DESCRIPTION = "This is a slightly modified version of the namedplus style, \
which fully conforms with the Journal of Neuroscience citation \
style. It should be characterised as an author-date citation \
style; a BibTeX style and a LaTeX package are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn17346"

RPM_NAME = "texlive-jneurosci-2023.209.1.00svn17346-56.1.noarch.rpm"
RPM_HASH = "584eb150b52dc922fff1661410e9550762b842c8663d88f78001af835fce669b0cd043b09c7ff472ee8ee744393f9cc635a3b65786a74406f3eb0053ba78cda9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jneurosci.sty \
texlive-jneurosci"

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
