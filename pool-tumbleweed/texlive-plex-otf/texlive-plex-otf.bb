SUMMARY = "Support for the OpenType font IBM Plex"
DESCRIPTION = "This package supports the free otf fonts from the IBM Plex \
project which are available from GitHub or already part of your \
system (Windows/Linux/...). This package supports only XeLaTeX \
or LuaLaTeX; for pdfLaTeX use plex-mono.sty, plex-sans.sty, \
and/or plex-serif.sty from the plex package. IBM Plex has no \
math symbols. You will have to use one of the existing math \
fonts if you need them."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07asvn47562"

RPM_NAME = "texlive-plex-otf-2023.201.0.0.07asvn47562-52.1.noarch.rpm"
RPM_HASH = "a833f1a7f738eec869979b6d8cc0cdc7cb49f6127cb171cc6f76b966dda5d7613803f47a2720944a2579ddf6a0fc41ef21b20a2d5904a921c9fe1761df2e5d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(plex-otf.sty) \
texlive-plex-otf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(textcomp.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
