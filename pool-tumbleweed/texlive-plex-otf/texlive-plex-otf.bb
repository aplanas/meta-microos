SUMMARY = "Support for the OpenType font IBM Plex"
DESCRIPTION = "This package supports the free otf fonts from the IBM Plex \
project which are available from GitHub or already part of your \
system (Windows/Linux/...). This package supports only XeLaTeX \
or LuaLaTeX; for pdfLaTeX use plex-mono.sty, plex-sans.sty, \
and/or plex-serif.sty from the plex package. IBM Plex has no \
math symbols. You will have to use one of the existing math \
fonts if you need them."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07asvn47562"

RPM_NAME = "texlive-plex-otf-2023.209.0.0.07asvn47562-53.1.noarch.rpm"
RPM_HASH = "f0171ab3b0645fd34781744fc8cd8070d604b48fdfe1bda886ef112a42cfa2c6cb06baf5a981ff61a0e3f9952518240557fb168891c14f450dff801e30277412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plex-otf.sty \
texlive-plex-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
