SUMMARY = "Maths symbol abbreviations"
DESCRIPTION = "Provides macros for defining systematic mnemonic abbreviations, \
starting with ` for math symbols and \\' for arrows, using \
standard symbols as well as those from the amsfonts bundle and \
the stmaryrd package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qsymbols-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "4ec2b374bbe348cb9d3dd2370584d49da813cac983b4ca9c1885f45fcb4dee27e6c17aa94393cec5336c8111eed1f2462b5554269ffa9a615e120afa32c5ec67"
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
