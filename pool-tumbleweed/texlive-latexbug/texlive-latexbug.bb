SUMMARY = "Bug-classification for LaTeX related bugs"
DESCRIPTION = "The package is written in order to help identifying the \
rightful addressee for a bug report. The LaTeX team asks that \
it will be loaded in any test file that is intended to be sent \
to the LaTeX bug database as part of a bug report."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0nsvn63596"

RPM_NAME = "texlive-latexbug-2023.209.1.0nsvn63596-55.1.noarch.rpm"
RPM_HASH = "e39bcf9127740314f11975105bf9ad576f1b264fb27c07ecb3d64dcaba06b5af58191de430f4209c47b14ce6b541a17f645648a20d60050a93bda4fc98d87393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexbug.sty \
texlive-latexbug"

RDEPENDS:${PN} += "/usr/bin/sh \
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
