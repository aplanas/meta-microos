SUMMARY = "Maths symbol abbreviations"
DESCRIPTION = "Provides macros for defining systematic mnemonic abbreviations, \
starting with ` for math symbols and \\' for arrows, using \
standard symbols as well as those from the amsfonts bundle and \
the stmaryrd package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qsymbols-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "7e32425c2d35d846db252ee8366c5102c1e6491bf57c636d968ce67f66c3f78661cda10c7596259cfe1d20e1d495d6639eae6674beb02dc0c91571d1727578d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qsymbols.sty \
texlive-qsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-stmaryrd.sty \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
