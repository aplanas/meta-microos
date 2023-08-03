SUMMARY = "A 'new' version of the karta cartographic fonts"
DESCRIPTION = "A development of the karta font, offering more mathematical \
stability in Metafont. A version that will produce the glyphs \
as Encapsulated PostScript, using MetaPost, is also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn16437"

RPM_NAME = "texlive-nkarta-2023.209.0.0.2svn16437-55.1.noarch.rpm"
RPM_HASH = "03726fe2c3237ca79d6f842749a641da375161f75b4152a12d8d9812593fc27abcfea9196be71e04ba01464c3ae965505111b5a49f3df710542827e6f7bb94d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nkarta15.tfm \
texlive-nkarta"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
