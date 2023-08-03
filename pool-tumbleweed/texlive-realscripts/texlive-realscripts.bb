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

PV = "2023.209.0.0.3dsvn56594"

RPM_NAME = "texlive-realscripts-2023.209.0.0.3dsvn56594-54.1.noarch.rpm"
RPM_HASH = "cbb838b6e61e4784d9f2ae1fbe4741a39104778cb6cb2e3292346aff722736fc6d44aab00e8d398721e894e5a671ed3893c64c929037e85dfa0109985499c46c"
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
