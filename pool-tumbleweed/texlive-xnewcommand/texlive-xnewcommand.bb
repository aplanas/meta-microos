SUMMARY = "Define \\global and \\protected commands with \\newcommand"
DESCRIPTION = "The package provides the means of defining \\global and (e-TeX) \
\\protected commands, within the framework of LaTeX's standard \
\\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-2023.209.1.2svn15878-53.2.noarch.rpm"
RPM_HASH = "aa5b055571b70726b05fdff904aeaf6fa96660f0f45655a75ef475742d9528dbc48988ff60a1e0878dfd6fc3be9afcc94977bfee2239c58b5c45166f6a9f211a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xnewcommand.sty \
texlive-xnewcommand"

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
