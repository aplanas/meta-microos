SUMMARY = "Automatic line breaking of displayed equations"
DESCRIPTION = "The package provides solutions to a number of common \
difficulties in writing displayed equations and getting \
high-quality output. For example, it is a well-known \
inconvenience that if an equation must be broken into more than \
one line, 'left...right' constructs cannot span lines. The \
breqn package makes them work as one would expect whether or \
not there is an intervening line break. The single most \
ambitious goal of the package, however, is to support automatic \
linebreaking of displayed equations. Such linebreaking cannot \
be done without substantial changes under the hood in the way \
formulae are processed; the code must be watched carefully, \
keeping an eye on possible glitches. The bundle also contains \
the flexisym and mathstyle packages, which are both designated \
as support for breqn."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98lsvn60881"

RPM_NAME = "texlive-breqn-2023.209.0.0.98lsvn60881-53.1.noarch.rpm"
RPM_HASH = "d90540310ba6836356fde73c5e6a8e251fb48b758594548d00b3dd0ecd2e669589d5874b66f510ba6290b8310e6da504e487ae0410da22bf8ea65850914cffab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breqn.sty \
tex-flexisym.sty \
tex-mathstyle.sty \
texlive-breqn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
