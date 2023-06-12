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

PV = "2023.201.1.1.0svn65860"

RPM_NAME = "texlive-algpseudocodex-2023.201.1.1.0svn65860-54.1.noarch.rpm"
RPM_HASH = "4991c68dca550aaae407884977e78320bb791206bfdb1ba1d0490a939ffd91944adb21efd5eaa0de1c5025fe7c4615647b5351be59680bb8090538afe65ec811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(algpseudocodex.sty) \
texlive-algpseudocodex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(algorithmicx.sty) \
tex(etoolbox.sty) \
tex(fifo-stack.sty) \
tex(kvoptions.sty) \
tex(tabto.sty) \
tex(tikz.sty) \
tex(totcount.sty) \
tex(varwidth.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
