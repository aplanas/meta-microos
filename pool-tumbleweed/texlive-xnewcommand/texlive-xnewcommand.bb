SUMMARY = "Define \\global and \\protected commands with \\newcommand"
DESCRIPTION = "The package provides the means of defining \\global and (e-TeX) \
\\protected commands, within the framework of LaTeX's standard \
\\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-2023.201.1.2svn15878-52.1.noarch.rpm"
RPM_HASH = "7d92e80991904aea6a6b577f8b2a8c26d6402c173d730ca1f4665f86196427f4dccdd09431089726aab2964d06398a58d0a8e6babaa458a64c517d6b0902455b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xnewcommand.sty) \
texlive-xnewcommand"

RDEPENDS:${PN} += "/bin/sh \
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
