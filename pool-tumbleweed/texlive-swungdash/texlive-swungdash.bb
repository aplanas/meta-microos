SUMMARY = "Typeset a swung dash in LaTeX"
DESCRIPTION = "The swung dash (U+2053) is a useful character traditionally \
used in typsetting dictionaries, but not supported by most \
typefaces. This package provides one simple command to typeset \
a swung dash in XeLaTeX and LuaLaTeX, by applying \
transformations to the given font's glyph for a tilde."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn64204"

RPM_NAME = "texlive-swungdash-2023.209.1.0.0svn64204-58.1.noarch.rpm"
RPM_HASH = "d0123f49e07f0ef91e55cf40a59bbc577df99e040dddfc78a1e3f2e72a7679551516270b4e7a0c937c6a636a6119f5cafba30388f090dd77356ab28b9c0f1b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swungdash.sty \
texlive-swungdash"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-graphicx.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
