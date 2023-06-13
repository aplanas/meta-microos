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

PV = "2023.201.0.0.96svn26789"

RPM_NAME = "texlive-framed-2023.201.0.0.96svn26789-52.1.noarch.rpm"
RPM_HASH = "213901fc0c1c286ffa05ee2cf107e7e62e5f21a54e3eb772fa23ef9182719581ed3b59409d06d0817df81bd78db3edfe2af738f39f02fa3867708718fd4d4f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(framed.sty) \
texlive-framed"

RDEPENDS:${PN} += "/bin/sh \
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
