SUMMARY = "Put objects at an absolute position"
DESCRIPTION = "The (PSTricks-related) package provides a command \
\\pstPutAbs(x,y) to put an object at an arbitrary absolute (or \
even a relative) position on the page."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-pst-abspos-2023.209.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "4f19e871960e21812feaf9a7134ea67df5a3609065695a47d5f2a52608ef82e0709467aef0231ba40ae7e38b6250016d746340b1f0292dd97d7c91895cd4457c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-abspos.sty \
tex-pst-abspos.tex \
texlive-pst-abspos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
