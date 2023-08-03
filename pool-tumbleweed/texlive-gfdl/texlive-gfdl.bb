SUMMARY = "Support for using GFDL in LaTeX"
DESCRIPTION = "The GFDL (GNU Free Documentation License) is a popular license \
used for programming manuals, documentations and various other \
textual works too, but using this license with LaTeX is not \
very convenient. This package aims to help users in easily \
using the license without violating any rules of the license. \
With a handful of commands, users can rest assured that their \
document will be perfectly licensed under GFDL."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn65415"

RPM_NAME = "texlive-gfdl-2023.209.0.0.1svn65415-53.1.noarch.rpm"
RPM_HASH = "67d53417ed9c5dfbbd0c0ff7ace3ab8904d171e58027b9526fd1ba7b9058d93578d647b21243c0b19b6d9a1339c4ebb1b773618ae3b6d6c27ce711f66f0c54a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfdl-tex-1p1.tex \
tex-gfdl-tex-1p2.tex \
tex-gfdl-tex-1p3.tex \
tex-gfdl.sty \
texlive-gfdl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csquotes.sty \
tex-expkv-def.sty \
tex-expkv-opt.sty \
tex-float.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
