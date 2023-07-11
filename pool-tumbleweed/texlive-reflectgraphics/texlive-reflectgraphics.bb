SUMMARY = "Techniques for reflecting graphics"
DESCRIPTION = "The package provides a macro for reflecting images, in a number \
of different ways, in pursuit of 'more striking' graphics in a \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-2023.201.0.0.2csvn40612-53.2.noarch.rpm"
RPM_HASH = "888826a81164a92e05938da04e4363e862d38f05500d71804f7723034a32c8e38307f261bc09b6e1894c8f94324f48e8e32715536fd869039650ebdd174f1313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reflectgraphics.sty \
texlive-reflectgraphics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.cfg \
tex-graphicx.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
