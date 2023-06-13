SUMMARY = "Sort arrays (or portions of them)"
DESCRIPTION = "The package provides a mechanism for sorting arrays (or \
portions of them); the arrays should have been created using \
the arrayjobx package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn31576"

RPM_NAME = "texlive-arraysort-2023.201.1.0svn31576-53.1.noarch.rpm"
RPM_HASH = "15ea3bbb3f435da285b96e4a863caabe4a44575bdf6bbadc9292db333d6eb47fabe17c9386e68b7b0a1287f6076930fede0e6b39864e8c08d08faca0248b61b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arraysort.sty) \
texlive-arraysort"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(arrayjobx.sty) \
tex(calc.sty) \
tex(etoolbox.sty) \
tex(ifthen.sty) \
tex(lcg.sty) \
tex(macroswap.sty) \
tex(pdftexcmds.sty) \
tex(xargs.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
