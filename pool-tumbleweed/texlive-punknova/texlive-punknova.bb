SUMMARY = "OpenType version of Knuth's Punk font"
DESCRIPTION = "The font was generated from a MetaPost version of the sources \
of the 'original' punk font. Knuth's original fonts generated \
different shapes at random. This isn't actually possible in an \
OpenType font; rather, the font contains several variants of \
each glyph, and uses the OpenType randomize function to select \
a variant for each invocation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.003svn24649"

RPM_NAME = "texlive-punknova-2023.201.1.003svn24649-53.2.noarch.rpm"
RPM_HASH = "78d55939ffac7407fb01a0272b1995a0dba7df199252d5a8c3d906446958a8875e43485762197e806cfc4bef0674024bbc8d918ca225ef6864a951266f98edfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova"

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
texlive-punknova-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
