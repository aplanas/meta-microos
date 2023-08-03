SUMMARY = "A late medieval OpenType cursive font"
DESCRIPTION = "The package contains the free OpenType medieval cursive font \
Aboensis and a style file to use it in XeLaTeX documents. The \
font is based on Codex Aboensis, that is a law book written in \
Sweden in the 1430s. Since medieval cursive is very difficult \
to read for modern people, the font is not suitable for use as \
an ordinary book font, but is intended for emulating late \
medieval manuscripts. The font contains two sets of initials: \
Lombardic and cursive to go with the basic alphabet, and there \
is support for writing two-colored initials and capitals. There \
are also a large number of abbreviation sigla that can be \
accessed as ligature substitutions. The style file contains \
macros that help to use the extended features of the font such \
as initials and two-colored capitals. There are also macros to \
help achieve even pages with consistent line spacing."
LICENSE = "OFL-1.1"

PV = "2023.209.svn62977"

RPM_NAME = "texlive-aboensis-2023.209.svn62977-55.1.noarch.rpm"
RPM_HASH = "ab6c0682f9a934e521023f8a1b29ce96048751cc5dd820dd5e79f22084da8d4bcfb868057383b1caaaa89810716175ff27a3b2d63d3ef64a1a42f1e90b3f7152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aboensis.sty \
texlive-aboensis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-xcolor.sty \
texlive \
texlive-aboensis-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
