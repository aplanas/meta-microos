SUMMARY = "Write Metanorma standardization documents using LaTe"
DESCRIPTION = "metanorma This work includes a LaTeX document class, a \
`latexml` script and a `latexmlpost` stylesheet which allow you \
to write a LaTeX document and transcode it into Metanorma's \
`ADOC` format. This work is sponsored by Ribose Inc. \
(<https://www.ribose.com>). This work is maintained by Ribose \
Inc. (<open.source@ribose.com>)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.0svn55010"

RPM_NAME = "texlive-metanorma-2023.201.0.0.5.0svn55010-54.1.noarch.rpm"
RPM_HASH = "1df924aa65120ceee1c29d2b9bd417e0e9262596a4d162355833ded01600cf89b71cd8bca0c829c0fd2d2abd3b1f35d1112e03ac1777cb4be15247d919620782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(metanorma.cls) \
texlive-metanorma"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(article.cls) \
tex(enumitem.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(mdframed.sty) \
tex(subcaption.sty) \
tex(ulem.sty) \
tex(verbatim.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
