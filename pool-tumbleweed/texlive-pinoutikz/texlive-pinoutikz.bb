SUMMARY = "Draw chip pinouts with TikZ"
DESCRIPTION = "The package provides a set of macros for typesetting electronic \
chip pinouts. It is designed as a tool that is easy to use, \
with a lean syntax, native to LaTeX, and directly supporting \
PDF output format. It has therefore been based on the very \
impressive TikZ package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn55966"

RPM_NAME = "texlive-pinoutikz-2023.209.1.1.2svn55966-52.1.noarch.rpm"
RPM_HASH = "5b72464b4c2a1b7a0b09acfe63d11db5d8f0f8ddbefc7f369adac2142973fdb72da728b08970e578d259559d74c917ac925bed395b7f08f71658394b6d8d6cea"
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
