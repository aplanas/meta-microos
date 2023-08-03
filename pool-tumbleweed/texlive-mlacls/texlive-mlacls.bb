SUMMARY = "LaTeX class for MLA papers"
DESCRIPTION = "In the United States, secondary and undergraduate students are \
generally expected to adhere to the format prescribed by the \
Modern Language Association (MLA) for typewritten essays, \
research papers and writings. This package provides a simple, \
straightforward LaTeX class for composing papers almost \
perfectly adherent to the MLA style guide."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn60508"

RPM_NAME = "texlive-mlacls-2023.209.1.0svn60508-55.1.noarch.rpm"
RPM_HASH = "932874dad790269d7e46630120eb030decfb40bfd245ef8da85b20ceac5a4b9c96dbd1954b89408982021afd662fc1058fa02c2bcdc663f5daa6b49f7863b7e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mla.cls \
texlive-mlacls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-enotez.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fullpage.sty \
tex-graphicx.sty \
tex-hanging.sty \
tex-hyperref.sty \
tex-microtype.sty \
tex-newtxtext.sty \
tex-ragged2e.sty \
tex-titlesec.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
