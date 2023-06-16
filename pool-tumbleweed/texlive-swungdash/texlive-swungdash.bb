SUMMARY = "Typeset a swung dash in LaTeX"
DESCRIPTION = "The swung dash (U+2053) is a useful character traditionally \
used in typsetting dictionaries, but not supported by most \
typefaces. This package provides one simple command to typeset \
a swung dash in XeLaTeX and LuaLaTeX, by applying \
transformations to the given font's glyph for a tilde."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn64204"

RPM_NAME = "texlive-swungdash-2023.201.1.0.0svn64204-57.1.noarch.rpm"
RPM_HASH = "b6c3ac06a98fdc713ce61942bf2ad84e8a7146e1b8ec82e016c0eb9b5c4a603d94a5029f71892a3935329eead6d9dc6d89bd14606c211dba146956429fe1b711"
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
