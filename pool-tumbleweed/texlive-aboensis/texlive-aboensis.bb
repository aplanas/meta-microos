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

PV = "2023.201.svn62977"

RPM_NAME = "texlive-aboensis-2023.201.svn62977-54.1.noarch.rpm"
RPM_HASH = "830e69e40c1c051b3eb97b174523508d2717d405fc2851ac24a2fe71ca9339c0287c05d125fdabc921c0e026e398c7447a973e75195ca85400903a736f9fd134"
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
