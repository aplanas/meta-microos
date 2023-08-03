SUMMARY = "Simple commands for drawing customisable dice"
DESCRIPTION = "The customdice package for LaTeX, LuaLaTeX and XeTeX that \
provides functionality for drawing dice. The aim is to provide \
highly-customisable but simple-to-use commands, allowing: \
adding custom text to dice faces; control over colouring; \
control over sizing."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64089"

RPM_NAME = "texlive-customdice-2023.209.1.1svn64089-55.1.noarch.rpm"
RPM_HASH = "a59cac4cbea5a376d2790ffa296fee8fd6b56638c8cf1d7205965da07093f359056aed6163aef9920a4c426eec197f8b5bda5568ab6fa65376157fa73482c64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-customdice.sty \
texlive-customdice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
