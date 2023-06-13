SUMMARY = "Generate Unicode characters from accented glyphs"
DESCRIPTION = "The package supports XeTeX's (and other putative future similar \
engines') need for Unicode characters, in a similar way to what \
the fontenc does for 8-bit (and the like) fonts: convert \
accent-glyph sequence to a single Unicode character for output. \
The package also covers glyphs specified by packages (such as \
tipa) which define many commands for single text glyphs."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-2023.201.0.0.981svn30466-52.1.noarch.rpm"
RPM_HASH = "07de570f3e73bb49e82d38f4feb4f09d3449967c80c6ff25d75b269159063abbd7994f093a31868f5bb9cde94267c9cbbb06c9d1b869c762d52d986e90831adb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xunicode.sty) \
texlive-xunicode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(t3enc.def) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tipa"

inherit rpm
