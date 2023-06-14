SUMMARY = "A LuaLaTeX package for creating cloze texts"
DESCRIPTION = "This is a LuaTeX or LuaLaTeX package for generating cloze \
texts. The main feature of the package is that the formatting \
doesn't change when using the hide and show options. There are \
the commands \\cloze, \\clozefix, \\clozefil, \\clozenol, \
\\clozestrike and the environments clozepar and clozebox to \
generate cloze texts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn55763"

RPM_NAME = "texlive-cloze-2023.201.1.6svn55763-53.1.noarch.rpm"
RPM_HASH = "a2e40f27791416df703167a91e6c183244f800cd9ba4ba1b7b1c8a96201d2c98db28e62897aad91363b714815004b7797e6716973aabf2f1acd8495394377328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cloze.sty \
tex-cloze.tex \
texlive-cloze"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
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
