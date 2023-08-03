SUMMARY = "Typeset transform signs"
DESCRIPTION = "A package for typesetting various transformation signs for \
Laplace transforms, Fourier transforms and others."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-trfsigns-2023.209.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "f88c71732a9da76459b2c9be6f3098831601d71455e6a886cc874c606f5405610cd69a15fadf62c1a92fb5f1bf3b92850446e194c1d890e1a6434aea33814fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trfsigns.sty \
texlive-trfsigns"

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
