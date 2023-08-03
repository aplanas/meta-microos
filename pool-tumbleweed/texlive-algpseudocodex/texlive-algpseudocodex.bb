SUMMARY = "Package for typesetting pseudocode"
DESCRIPTION = "This package allows typesetting pseudocode in LaTeX. It is \
based on algpseudocode from the algorithmicx package and uses \
the same syntax, but adds several new features and \
improvements. Notable features include customizable indent \
guide lines and the ability to draw boxes around parts of the \
code for highlighting differences. This package also has better \
support for long code lines spanning several lines and improved \
comments."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn65860"

RPM_NAME = "texlive-algpseudocodex-2023.209.1.1.0svn65860-55.1.noarch.rpm"
RPM_HASH = "f01bc7a87c31b22ee5068288ddbb1cf72205d5027d32f9898fd23be5cef6bc0f8859c6180020d9827efe176ffad8e45d54ed5c630f1c2c9428054443a95aa3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algpseudocodex.sty \
texlive-algpseudocodex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmicx.sty \
tex-etoolbox.sty \
tex-fifo-stack.sty \
tex-kvoptions.sty \
tex-tabto.sty \
tex-tikz.sty \
tex-totcount.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
