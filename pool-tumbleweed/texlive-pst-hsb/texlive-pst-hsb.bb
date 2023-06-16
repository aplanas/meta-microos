SUMMARY = "Curves with continuous colours"
DESCRIPTION = "This is a PSTricks-related package. It can plot lines and/or \
curves with continuous colours. Only colours defined in the hsb \
model are supported"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn61322"

RPM_NAME = "texlive-pst-hsb-2023.201.0.0.02svn61322-52.1.noarch.rpm"
RPM_HASH = "64971601eb7fc744556e0053307dc7eede840e97cebb20065ddaa56de3c9752bd3c426333266b1fab9a55fd1b383c2eb712f7ea9dfdb0abff7a2b2ca94c4516d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-hsb.sty \
tex-pst-hsb.tex \
texlive-pst-hsb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
