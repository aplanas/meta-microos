SUMMARY = "Typesetting spectral sequence charts"
DESCRIPTION = "The package provides commands to draw spectral sequence \
diagrams, providing facilities for clipping and arranging \
multiple symbols so that they do not overlap. The package is \
built using pgf, and shares that systems large demands for TeX \
system memory. Its geometric commands are based on a turtle \
graphics model, and control structures such as loops and \
conditionals are available."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01svn31585"

RPM_NAME = "texlive-sseq-2023.209.2.01svn31585-58.1.noarch.rpm"
RPM_HASH = "cd2c176b1aec98828f50d65b22aad99d91f3a142a84f15dc26a82f656f8b08c66ddd9d8328ad398abcfb4702bbcebf3527adbce979eaa73040c70db7473ec368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sseq.sty \
texlive-sseq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pgf.sty \
tex-pifont.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
