SUMMARY = "Simple commands for drawing customisable dice"
DESCRIPTION = "The customdice package for LaTeX, LuaLaTeX and XeTeX that \
provides functionality for drawing dice. The aim is to provide \
highly-customisable but simple-to-use commands, allowing: \
adding custom text to dice faces; control over colouring; \
control over sizing."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn64089"

RPM_NAME = "texlive-customdice-2023.204.1.1svn64089-54.1.noarch.rpm"
RPM_HASH = "b7fe4e1348b56511764b287eaea4b23ce5d79cf483b44a9f5ee0f5ae6041cb6cc2bd0c6a3468a606b80312ca70f075d8837b12fe2d50cdb725b08677e5f8b03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-customdice.sty \
texlive-customdice"

RDEPENDS:${PN} += "/bin/sh \
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
