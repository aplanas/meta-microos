SUMMARY = "Create interactive figures in LaTeX"
DESCRIPTION = "FigPut allows figures to be specified using JavaScript. The \
resulting document can be viewed as a static PDF, as usual, or \
the document can be viewed in a web-browser, in which case the \
figures are interactive. A variety of interactive widgets are \
included."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.90svn63957"

RPM_NAME = "texlive-figput-2023.201.0.0.90svn63957-52.1.noarch.rpm"
RPM_HASH = "9d8af0de2267da23a630ab04f4e1c362ba13eac13dcf9f8f01cb8b19077c5969bc5eaed9aa4c6121e33c20805c9c56930eb3c811e71bbd0f509c562bc0190ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figput.sty \
texlive-figput"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-verbatim.sty \
tex-xsim.sty \
tex-zref-abspage.sty \
tex-zref-pagelayout.sty \
tex-zref-savepos.sty \
tex-zref-thepage.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
