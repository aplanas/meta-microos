SUMMARY = "A LuaLaTeX package for creating cloze texts"
DESCRIPTION = "This is a LuaTeX or LuaLaTeX package for generating cloze \
texts. The main feature of the package is that the formatting \
doesn't change when using the hide and show options. There are \
the commands \\cloze, \\clozefix, \\clozefil, \\clozenol, \
\\clozestrike and the environments clozepar and clozebox to \
generate cloze texts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn55763"

RPM_NAME = "texlive-cloze-2023.209.1.6svn55763-54.1.noarch.rpm"
RPM_HASH = "c3f04eb7fe4b3301077b78b2726fee43c69c23193abb2af65fcc279a0450e83197fec9fe6e4cc0fceaad432b106217b485557b4b8a095f036fdfa205fcfc9dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cloze.sty \
tex-cloze.tex \
texlive-cloze"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-luatexbase-mcb.sty \
tex-setspace.sty \
tex-stackengine.sty \
tex-transparent.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
