SUMMARY = "Access lilypond fragments and glyphs, in LaTeX"
DESCRIPTION = "The package provides the means to include arbitrary elements of \
Lilypond notation, including symbols from Lilypond's Emmentaler \
font, in a LaTeX document. The package uses OpenType fonts, and \
as a result must be compiled with LuaLaTeX or XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-2023.201.0.0.2.4svn56473-54.1.noarch.rpm"
RPM_HASH = "9d04a56229ed5b05790478e46a44cb6b67e9d180e59673e02d6b5ec4c55b83438326185bf4ace6adc89fc86b9e2f2b15873c91115a498896500c51a6d5151887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lilyglyphs.sty \
texlive-lilyglyphs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
