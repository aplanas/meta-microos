SUMMARY = "Convenience package for float placement"
DESCRIPTION = "The hep-float package redefines some LaTeX float placement \
defaults and defines convenience wrappers for floats. The \
package is loaded with \\usepackage{hep-float}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64904"

RPM_NAME = "texlive-hep-float-2023.209.1.1svn64904-54.2.noarch.rpm"
RPM_HASH = "725c49590ceec94ec428ed0cc960181e64a39012ce11df84c1e62c82c438788a941891c45a6a3295faa0ffbd5702fb28f358f413092117e9806910ce517eb2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-float.sty \
texlive-hep-float"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-multirow.sty \
tex-subcaption.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
