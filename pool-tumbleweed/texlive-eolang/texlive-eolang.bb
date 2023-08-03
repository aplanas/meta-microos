SUMMARY = "Formulas and graphs for the EO programming language"
DESCRIPTION = "This LaTeX package helps you write [?] -calculus formulas and \
SODG graphs for the EO programming language."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-2023.209.0.0.12.1svn66274-54.1.noarch.rpm"
RPM_HASH = "1e3afa14806b03d82f285b152d5432488d9eb6cd549fa8125bc04e4db835679d3595a769bdc1aa0cad6c500785592f5a3e4538626e730767073ece6bc582e7ec"
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
