SUMMARY = "Generate Unicode characters from accented glyphs"
DESCRIPTION = "The package supports XeTeX's (and other putative future similar \
engines') need for Unicode characters, in a similar way to what \
the fontenc does for 8-bit (and the like) fonts: convert \
accent-glyph sequence to a single Unicode character for output. \
The package also covers glyphs specified by packages (such as \
tipa) which define many commands for single text glyphs."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-2023.209.0.0.981svn30466-53.2.noarch.rpm"
RPM_HASH = "b5485205d738908d42e63aa87c9d1361b7afd585b1962f13e22df6f2cd59e0adf92d1272b58b496d4997db08c378237cca36dbc0575352a3331cc4ec27996fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xunicode.sty \
texlive-xunicode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-t3enc.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tipa"

inherit rpm
