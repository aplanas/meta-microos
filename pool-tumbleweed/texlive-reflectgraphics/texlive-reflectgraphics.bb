SUMMARY = "Techniques for reflecting graphics"
DESCRIPTION = "The package provides a macro for reflecting images, in a number \
of different ways, in pursuit of 'more striking' graphics in a \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-2023.201.0.0.2csvn40612-53.1.noarch.rpm"
RPM_HASH = "cf8e822c9e4a4075f35b3ff49150f832a42af2e6d72e5b767acec59bad69a262fb2005f9533d42ef7de6f4fa52cf0f8d0fd2d09c4e229678921da0d92c92cab0"
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
