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

RPM_NAME = "texlive-realscripts-2023.201.0.0.3dsvn56594-53.2.noarch.rpm"
RPM_HASH = "8ab46cedfc56c8d28fb6411b5f48bcc936ff378dc5e54023915d804050f46c71c952a0674721e453eea95758c078d0cfa59aa7598ab25aae34a5dbd70e4c5e06"
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
