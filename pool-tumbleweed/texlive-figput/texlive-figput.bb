SUMMARY = "Create interactive figures in LaTeX"
DESCRIPTION = "FigPut allows figures to be specified using JavaScript. The \
resulting document can be viewed as a static PDF, as usual, or \
the document can be viewed in a web-browser, in which case the \
figures are interactive. A variety of interactive widgets are \
included."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.90svn63957"

RPM_NAME = "texlive-figput-2023.209.0.0.90svn63957-53.1.noarch.rpm"
RPM_HASH = "1f681d7226dbbdfac091e40971aa6e21d26ec5e9a2af63ed1b2a3e760029a601c96cbd2a0620a5ece4700c6c7a8bda5275523e5e6e653e8b8d0ab091451c1788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figput.sty \
texlive-figput"

RDEPENDS:${PN} += "/usr/bin/sh \
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
