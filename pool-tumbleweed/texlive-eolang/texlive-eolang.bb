SUMMARY = "Formulas and graphs for the EO programming language"
DESCRIPTION = "This LaTeX package helps you write [?] -calculus formulas and \
SODG graphs for the EO programming language."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-2023.201.0.0.12.1svn66274-53.2.noarch.rpm"
RPM_HASH = "ad977cb0566a6fc950115db6bf8d2b36f88239165f82abf1ead9aecd51ea8dd923da5bb9d7fc028551b7940f5f9caf02d5dcf3bda9efac3454601c2e201d8f2f"
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
