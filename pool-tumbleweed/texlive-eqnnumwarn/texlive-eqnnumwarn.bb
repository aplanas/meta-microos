SUMMARY = "Modifies the amsmath equation environments to warn for a displaced equation number"
DESCRIPTION = "Sometimes an equation is too long that an equation number will \
be typeset below the equation itself, but yet not long enough \
to yield an 'overfull \\hbox' warning. The eqnnumwarn package \
modifies the standard amsmath numbered equation environments to \
throw a warning whenever this occurs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-2023.209.1.0svn45511-54.1.noarch.rpm"
RPM_HASH = "354d8799698c5a3334167c39f1b8fe81651d6718ae3ef4e4bc4f427e695b9c2d0bd2dbcede104818fd575f2258088c3bb92b5da74fd3eef70c445e1a72c9349a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnnumwarn.sty \
texlive-eqnnumwarn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
