SUMMARY = "Greek environment to be used with pdfLaTeX only"
DESCRIPTION = "This simple package defines a greek environment to be used with \
pdfLaTeX only, that accepts an optional Greek font family name \
to type its contents with. A similar \\greektxt command does a \
similar action for shorter texts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn63255"

RPM_NAME = "texlive-begingreek-2023.209.1.7svn63255-54.1.noarch.rpm"
RPM_HASH = "35758837e514a4656b6d30503a6288ed09b43b247e48e68b8152289de3c0f79de222abed3701c9860974da3ed88e3c2d9be01dfbf9a3d3638854b70501150606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-begingreek.sty \
texlive-begingreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
