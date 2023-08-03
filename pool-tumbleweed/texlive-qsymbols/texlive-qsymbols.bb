SUMMARY = "Maths symbol abbreviations"
DESCRIPTION = "Provides macros for defining systematic mnemonic abbreviations, \
starting with ` for math symbols and \\' for arrows, using \
standard symbols as well as those from the amsfonts bundle and \
the stmaryrd package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qsymbols-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "6a8f376d6ff92966391612f6f0f90d856a926a1b342c486bb8e3d4dd9247a557f504b4c83deba1d3675652a0daa6cc8b2c9cfdae93ddf1344c24f17a5bf14f27"
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
