SUMMARY = "Draw chip pinouts with TikZ"
DESCRIPTION = "The package provides a set of macros for typesetting electronic \
chip pinouts. It is designed as a tool that is easy to use, \
with a lean syntax, native to LaTeX, and directly supporting \
PDF output format. It has therefore been based on the very \
impressive TikZ package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn55966"

RPM_NAME = "texlive-pinoutikz-2023.201.1.1.2svn55966-51.1.noarch.rpm"
RPM_HASH = "5a5624e5aa0f1f898173a7a81b9113749786109b154db79ac8e332742ff3c971e712b3ff78457e6cff72417159eb39233ccdfe7764baa8ce8c6b7c2967968739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pinoutikz.sty \
texlive-pinoutikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-arrayjob.sty \
tex-forarray.sty \
tex-ifthen.sty \
tex-lmodern.sty \
tex-pgf.sty \
tex-tikz.sty \
tex-upquote.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
