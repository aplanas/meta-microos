SUMMARY = "Framed or shaded regions that can break across pages"
DESCRIPTION = "The package creates three environments: framed, which puts an \
ordinary frame box around the region, shaded, which shades the \
region, and leftbar, which places a line at the left side. The \
environments allow a break at their start (the \\FrameCommand \
enables creation of a title that is 'attached' to the \
environment); breaks are also allowed in the course of the \
framed/shaded matter. There is also a command \\MakeFramed to \
make your own framed-style environments."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.96svn26789"

RPM_NAME = "texlive-framed-2023.209.0.0.96svn26789-53.1.noarch.rpm"
RPM_HASH = "24e15c34c90622ac2d21272868ebdb69498169d611d530009d9a7982e9939d848f1f3ca1b55c9af93f668f148f0fb44cb065382b728cc36ffe030db6c96deca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-framed.sty \
texlive-framed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
