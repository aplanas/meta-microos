SUMMARY = "LaTeX class for MLA papers"
DESCRIPTION = "In the United States, secondary and undergraduate students are \
generally expected to adhere to the format prescribed by the \
Modern Language Association (MLA) for typewritten essays, \
research papers and writings. This package provides a simple, \
straightforward LaTeX class for composing papers almost \
perfectly adherent to the MLA style guide."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn60508"

RPM_NAME = "texlive-mlacls-2023.201.1.0svn60508-54.1.noarch.rpm"
RPM_HASH = "214536543a9d744f29ffd2a66bb1bb09cf4ccf1056dc6b5286b6e187d9621f5736213e04fc1b0f3688726f593193c482e3e46a3a2b9a18008637fcc66dccb091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mla.cls) \
texlive-mlacls"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(babel.sty) \
tex(caption.sty) \
tex(csquotes.sty) \
tex(enotez.sty) \
tex(enumitem.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(fullpage.sty) \
tex(graphicx.sty) \
tex(hanging.sty) \
tex(hyperref.sty) \
tex(microtype.sty) \
tex(newtxtext.sty) \
tex(ragged2e.sty) \
tex(titlesec.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
