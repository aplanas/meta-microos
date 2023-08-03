SUMMARY = "Dealing with some spacing issues"
DESCRIPTION = "This package provides macros for dealing with some spacing \
issues, e.g. centering a single line, making a variable strut, \
indenting a block, typesetting a compact list, placing two \
boxes side by side with vertical adjustment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn66393"

RPM_NAME = "texlive-spacingtricks-2023.209.1.6svn66393-58.1.noarch.rpm"
RPM_HASH = "aa9ae2b78401ee61c1e731bf539795f1a5f3ba297f2c5836b2e171072c5d78c2881eb91cac7a922dadd34e9713cc389091a321d2295ad858be08d2f3b9aab2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spacingtricks.sty \
texlive-spacingtricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-centeredline.sty \
tex-ifthen.sty \
tex-pifont.sty \
tex-setspace.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
