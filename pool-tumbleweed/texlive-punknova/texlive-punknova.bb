SUMMARY = "OpenType version of Knuth's Punk font"
DESCRIPTION = "The font was generated from a MetaPost version of the sources \
of the 'original' punk font. Knuth's original fonts generated \
different shapes at random. This isn't actually possible in an \
OpenType font; rather, the font contains several variants of \
each glyph, and uses the OpenType randomize function to select \
a variant for each invocation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.003svn24649"

RPM_NAME = "texlive-punknova-2023.209.1.003svn24649-54.1.noarch.rpm"
RPM_HASH = "fca538629f731dc5ec13249ac6c4b297e7dfa1c35f3c564b0d7ebf29c4dde15a29a41e705da0f6390b61313c968c85a5eb3c3f719580e01a5a0eef6c6261dc0c"
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
