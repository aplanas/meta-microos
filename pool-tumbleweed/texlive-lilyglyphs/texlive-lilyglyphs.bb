SUMMARY = "Access lilypond fragments and glyphs, in LaTeX"
DESCRIPTION = "The package provides the means to include arbitrary elements of \
Lilypond notation, including symbols from Lilypond's Emmentaler \
font, in a LaTeX document. The package uses OpenType fonts, and \
as a result must be compiled with LuaLaTeX or XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-2023.209.0.0.2.4svn56473-55.1.noarch.rpm"
RPM_HASH = "be8fa3b949133331fbe4b30a633c9bc889ce5df8382f14cb6d02a3175b86f652297a46121c31514e0ac81d14b92e41984c7b4cfc36cb8225dee9255bd02260ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lilyglyphs.sty \
texlive-lilyglyphs"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-keyval.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lilyglyphs-bin \
texlive-lilyglyphs-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
