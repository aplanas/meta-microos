SUMMARY = "Techniques for reflecting graphics"
DESCRIPTION = "The package provides a macro for reflecting images, in a number \
of different ways, in pursuit of 'more striking' graphics in a \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-2023.209.0.0.2csvn40612-54.2.noarch.rpm"
RPM_HASH = "ef4a71ec713098de54fd87eea79602dec1baffbd9c7609a4c76e6ecb4eb28ce59cf3752c04c65f65e229ce0c4b94621a7c0607346578a8e53aa97384a9ba8e57"
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
