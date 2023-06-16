SUMMARY = "Access OpenType subscript and superscript glyphs"
DESCRIPTION = "This small package replaces \\textsuperscript and \\textsubscript \
commands by equivalent commands that use OpenType font features \
to access appropriate glyphs if possible. The package also \
patches LaTeX's default footnote command to use this new \
\\textsuperscript for footnote symbols. The package requires \
fontspec running on either XeLaTeX or LuaLaTeX. The package \
holds functions that were once parts of the xltxtra package, \
which now loads realscripts by default."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3dsvn56594"

RPM_NAME = "texlive-realscripts-2023.201.0.0.3dsvn56594-53.1.noarch.rpm"
RPM_HASH = "33e06103b776e70f066522ab1e4d9254980b3daf4ee3fb5625b7eb698dfa8fd39be773daee8fb4232241bf71a3fe599a94806fbbd2e04fa22a38d0e6d9f59321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realscripts.sty \
texlive-realscripts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
