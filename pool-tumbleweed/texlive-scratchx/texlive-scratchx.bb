SUMMARY = "Include Scratch programs in LaTeX documents"
DESCRIPTION = "This package can be used to include every kind of Scratch \
program in LaTeX documents. This may be particularly useful for \
Math Teachers and IT specialists. The package depends on the \
following other LaTeX packages: calc, fp, ifsym, multido, tikz, \
xargs, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44906"

RPM_NAME = "texlive-scratchx-2023.209.1.1svn44906-54.1.noarch.rpm"
RPM_HASH = "a0e559131e3a281f7d488b7df62ee5c2900bf19a86242a6ed625208c04e8e20ba0a94bc860b8cd9dc0a8dc185d5ccc20d80577612164d2a5c12e220d8338700c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ScratchX.sty \
texlive-scratchx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp.sty \
tex-ifsym.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-xargs.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
