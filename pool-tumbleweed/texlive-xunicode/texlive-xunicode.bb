SUMMARY = "Generate Unicode characters from accented glyphs"
DESCRIPTION = "The package supports XeTeX's (and other putative future similar \
engines') need for Unicode characters, in a similar way to what \
the fontenc does for 8-bit (and the like) fonts: convert \
accent-glyph sequence to a single Unicode character for output. \
The package also covers glyphs specified by packages (such as \
tipa) which define many commands for single text glyphs."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-2023.201.0.0.981svn30466-52.2.noarch.rpm"
RPM_HASH = "103474d81c6f73adef078bfc7694086db6af4ba1ac08291de0915c9b8dd46a1ad13687eda387f116833910df056274d62a172779266fdb97a02fd7cb2d3f5673"
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
