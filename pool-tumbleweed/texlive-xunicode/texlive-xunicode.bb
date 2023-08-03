SUMMARY = "Generate Unicode characters from accented glyphs"
DESCRIPTION = "The package supports XeTeX's (and other putative future similar \
engines') need for Unicode characters, in a similar way to what \
the fontenc does for 8-bit (and the like) fonts: convert \
accent-glyph sequence to a single Unicode character for output. \
The package also covers glyphs specified by packages (such as \
tipa) which define many commands for single text glyphs."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-2023.209.0.0.981svn30466-53.1.noarch.rpm"
RPM_HASH = "dfa96dc1ac51f8a0fe6595ca3f42d6bd2a385b3c9c1f7426f1817aaa0f56484ccccbacea0e56a91ba7d030acf3d33a9eee294daa935f2d32eeb65c01ec94b8f4"
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
