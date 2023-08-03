SUMMARY = "Subscripts and superscripts with square brackets"
DESCRIPTION = "A LaTeX package to write alternative and customisable \
subscripts and superscripts, with square brackets in the source \
code."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62738"

RPM_NAME = "texlive-altsubsup-2023.209.1.1svn62738-55.1.noarch.rpm"
RPM_HASH = "4986f0986dc9aa4177f1ab8a0cf93768b26b0f243da51ea0965a904142495a847fffd1d6439778c7993bbafffdc49501d4e6a695d96553e630d2dfabf97e62dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-altsubsup.sty \
texlive-altsubsup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-spbmark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
