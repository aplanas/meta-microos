SUMMARY = "A PSTricks package to draw marble-like patterns"
DESCRIPTION = "This is a PSTricks package to draw marble-like patterns."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn50925"

RPM_NAME = "texlive-pst-marble-2023.209.1.6svn50925-53.1.noarch.rpm"
RPM_HASH = "ceed27f2d926f905b1dcbbca4ccc1c83187989a0718c56e824ac1ef19afb220d334fe993720c571d2618cb6e664f9d01eaba3c71f57d1c34828a9aa892098c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-marble.sty \
tex-pst-marble.tex \
texlive-pst-marble"

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
