SUMMARY = "OpenType version of Knuth's Punk font"
DESCRIPTION = "The font was generated from a MetaPost version of the sources \
of the 'original' punk font. Knuth's original fonts generated \
different shapes at random. This isn't actually possible in an \
OpenType font; rather, the font contains several variants of \
each glyph, and uses the OpenType randomize function to select \
a variant for each invocation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.003svn24649"

RPM_NAME = "texlive-punknova-2023.209.1.003svn24649-54.2.noarch.rpm"
RPM_HASH = "216835929f8fd622f0749b3f2532faaf27f468b32f0f298c679ddab1e6e6f73f06a228edd6445e37b9b70784e2df5f71e5983111ce10a8ae3f5e7a8812132646"
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
