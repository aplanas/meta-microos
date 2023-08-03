SUMMARY = "Assembling beamer frames according to audience"
DESCRIPTION = "The Beamer Audience package provides macros to easily assemble \
frames according to different audiences. It enables to pick up \
the frames for a specific audience while leaving their order \
according to a logical structure in the LaTeX source."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn23427"

RPM_NAME = "texlive-beameraudience-2023.209.0.0.1svn23427-54.1.noarch.rpm"
RPM_HASH = "a8f743de6b922534635ee7dfc08fbdc7bb4de263548163b08ada9148b5a04e673565758775080ff7308fcb6f8a7ee99f394d934bff485a601ecb05ae99a50be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beameraudience.sty \
texlive-beameraudience"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cprotect.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
