SUMMARY = "Draw rulers on the foreground or in the text"
DESCRIPTION = "This package draws horizontal and vertical rulers on the \
foreground of every (or the current) page at absolute \
positions. In this way, you can check the page layout \
dimensions. You can also draw various rulers in the text. The \
fgruler package requires the services of the following \
packages: kvoptions, etoolbox, xcolor, graphicx, eso-pic."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn63721"

RPM_NAME = "texlive-fgruler-2023.209.1.5svn63721-53.1.noarch.rpm"
RPM_HASH = "509b2e359f77d1233b440f42f860ad03377d2e1a19cbf243c9f48d6b1f49776ac712cd32a4872bd80a0457ad8123d966c69492f844f14ebfd1005e71a6eab1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fgruler.sty \
texlive-fgruler"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
