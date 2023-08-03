SUMMARY = "A series of tools to simplify your workflow"
DESCRIPTION = "ProjLib is a collection of tools to help you write LaTeX \
documents. With the main package ProjLib loaded, you no longer \
need to set up the theorem-like environments, nor to manually \
configure the appropriate multilingual settings. In addition, a \
series of auxiliary functionalities are introduced."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65475"

RPM_NAME = "texlive-projlib-2023.209.svn65475-53.1.noarch.rpm"
RPM_HASH = "69529396b89fe40f6ce342be52b87014025f8653ab50b0cfef46eed9282b78000d1781324d9c92a6e5f4b7687797e60f629de05a02cd777cd81a3c30bf78a3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProjLib.sty \
tex-projlib-author.sty \
tex-projlib-datetime.sty \
tex-projlib-draft.sty \
tex-projlib-font.sty \
tex-projlib-language.sty \
tex-projlib-logo.sty \
tex-projlib-math.sty \
tex-projlib-paper.sty \
tex-projlib-text.sty \
tex-projlib-theorem.sty \
tex-projlib-titlepage.sty \
texlive-projlib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-babel.sty \
tex-biolinum.sty \
tex-cfr-lm.sty \
tex-create-theorem.sty \
tex-csquotes.sty \
tex-ebgaramond-maths.sty \
tex-ebgaramond.sty \
tex-eulervm.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-lmodern.sty \
tex-mathastext.sty \
tex-mathpazo.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-newpxtext.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-notomath.sty \
tex-regexpatch.sty \
tex-relsize.sty \
tex-scontents.sty \
tex-setspace.sty \
tex-silence.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-create-theorem \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
