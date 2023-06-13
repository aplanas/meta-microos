SUMMARY = "Prevent line breaks after single letter words, units, or academic titles"
DESCRIPTION = "In some languages, like Czech or Polish, there should be no \
single letter words at the end of a line, according to \
typographical norms. This package handles such situations using \
LuaTeX's callback mechanism. In doing this, the package can \
detect languages used in the text and insert spaces only in \
parts of the document where languages requiring this feature \
are used. Another feature of this package is the inclusion of \
non-breakable space after initials (like in personal names), \
after or before academic degrees, and between numbers and \
units. The package supports both plain LuaTeX and LuaLaTeX. \
BTW: 'vlna' is the Czech word for 'wave' or 'curl' and also \
denotes the tilde which, in TeX, is used for 'unbreakable \
spaces'."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1jsvn64142"

RPM_NAME = "texlive-luavlna-2023.201.0.0.1jsvn64142-52.1.noarch.rpm"
RPM_HASH = "761ddd9ee2f82b3d7447d3f898d2d4257b5920d3d5affd053342cfc1d44013d7f245c8e4619e899e20e1c6366f4e75a6d5c9475c87edcce94e99e71e21eada6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luavlna.sty) \
tex(luavlna.tex) \
texlive-luavlna"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
