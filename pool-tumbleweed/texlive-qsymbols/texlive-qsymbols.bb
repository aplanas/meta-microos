SUMMARY = "Maths symbol abbreviations"
DESCRIPTION = "Provides macros for defining systematic mnemonic abbreviations, \
starting with ` for math symbols and \\' for arrows, using \
standard symbols as well as those from the amsfonts bundle and \
the stmaryrd package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qsymbols-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "b295784ffb32220050adcd2be00642df62534f2a0f75818f9708f94ed6560a3e855234873236b551b308eea9d31223b84692a348f031f68d76685600af4e3373"
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
