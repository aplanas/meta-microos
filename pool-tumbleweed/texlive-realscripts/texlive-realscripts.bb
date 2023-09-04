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

RPM_NAME = "texlive-realscripts-2023.209.0.0.3dsvn56594-54.2.noarch.rpm"
RPM_HASH = "acaf7cae13b5fef81fe2e794fc5ed1a092196c85474f2934eddec6cb8273bf6c36ad545e4beda7cad6d5a3c47be866c251828095c7b06b1d644dbc6e080ea5a5"
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
