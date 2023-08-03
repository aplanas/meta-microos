SUMMARY = "Provides a horizontal timeline"
DESCRIPTION = "A timeline package that allows labelling of events with per-day \
granularity. Other features include relative positioning with \
unit specification, adjustable tick mark step size, and scaling \
to specified width."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn37934"

RPM_NAME = "texlive-chronology-2023.209.1.1.1svn37934-54.1.noarch.rpm"
RPM_HASH = "50fc5034811ec53eff350e11d238722946213148822ee28c403cb98038ee6fa89b20c7df610dee18f519af34f48cea85f36fb69195e10aab85124437a494ea62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chronology.sty \
texlive-chronology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
