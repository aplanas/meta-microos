SUMMARY = "Typeset Karnaugh maps"
DESCRIPTION = "This package provides an easy to use interface to typeset \
Karnaugh maps using TikZ. Though similar to the karnaugh \
macros, it provides a key-value system to customize \
karnaughmaps and a proper LaTeX package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn36989"

RPM_NAME = "texlive-karnaughmap-2023.209.2.0svn36989-56.1.noarch.rpm"
RPM_HASH = "d9e9d15e9d618523ce579757ac1e5b07a602e4f243f00bcef5da9b04617ebd0863c0ca42b5f127085c91efbe5908d8b1cee8da48deb15bfef6d8a44316ee431a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karnaughmap.sty \
texlive-karnaughmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
