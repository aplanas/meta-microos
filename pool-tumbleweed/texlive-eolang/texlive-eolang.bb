SUMMARY = "Formulas and graphs for the EO programming language"
DESCRIPTION = "This LaTeX package helps you write [?] -calculus formulas and \
SODG graphs for the EO programming language."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-2023.209.0.0.12.1svn66274-54.2.noarch.rpm"
RPM_HASH = "d06026cac6be9b5203ad73ab9f08e54387d70a4a100fbab8afc8bb432293f428248b42a3797607a3ca396a3d8ee49ae3fca7112512abfbbe8bc09025e8779901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eolang.sty \
texlive-eolang"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-fancyvrb.sty \
tex-hyperref.sty \
tex-iexec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
tex-pgfopts.sty \
tex-stmaryrd.sty \
tex-tikz.sty \
tex-trimclip.sty \
tex-xstring.sty \
texlive \
texlive-amsfonts \
texlive-amsmath \
texlive-fancyvrb \
texlive-filesystem \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd"

inherit rpm
