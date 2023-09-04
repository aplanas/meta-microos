SUMMARY = "Define commands that peek ahead in the input stream"
DESCRIPTION = "The package provides tools to help define commands that, like \
\\xspace and the LaTeX command \\textit, peek at what follows \
them in the command stream and choose appropriate behaviour."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-2023.209.0.0.2svn61719-53.2.noarch.rpm"
RPM_HASH = "cc803ec8d1cb08a58cc2c084500201eba808fa6a67f86fd0c90b2ddfad4bcf1500a80182cf8ff237f54a1d0f6836d41edc64d8bb6694e8666b483f8f78b5058a"
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
