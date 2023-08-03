SUMMARY = "Define commands that peek ahead in the input stream"
DESCRIPTION = "The package provides tools to help define commands that, like \
\\xspace and the LaTeX command \\textit, peek at what follows \
them in the command stream and choose appropriate behaviour."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-2023.209.0.0.2svn61719-53.1.noarch.rpm"
RPM_HASH = "6e813c3cf53aa3668173c55810eef549ec78375d52d7b967a5631465e0b9bea913517d169a5a2aa0a3370dee279ddda20ff769671c92de7a2487f479411198fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpeek.sty \
texlive-xpeek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
