SUMMARY = "Many-featured Young tableaux and Young diagrams"
DESCRIPTION = "The package provides several functions for drawing Young \
tableaux and Young diagrams, extending the young and youngtab \
packages but providing lots more features. Skew and coloured \
tableaux are easy, and pgfkeys-enabled options are provided \
both at package load and configurably."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn59580"

RPM_NAME = "texlive-ytableau-2023.209.1.4svn59580-53.1.noarch.rpm"
RPM_HASH = "d94cbfa029bb12a88818426c3d3c8bf3edbc73eb464e4d7f318cf6dbd0eb82132d2a71c75002c8c52c3e10f14b8ada57969b974b398794327f700b841b0a5792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ytableau.sty \
texlive-ytableau"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
