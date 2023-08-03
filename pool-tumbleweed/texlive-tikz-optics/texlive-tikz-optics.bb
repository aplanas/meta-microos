SUMMARY = "A library for drawing optical setups with TikZ"
DESCRIPTION = "This package provides a new TikZ library designed to easily \
draw optical setups with TikZ. It provides shapes for lens, \
mirror, etc. The geometrically (in)correct computation of light \
rays through the setup is left to the user."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.3svn62977"

RPM_NAME = "texlive-tikz-optics-2023.209.0.0.2.3svn62977-53.1.noarch.rpm"
RPM_HASH = "2952fd1c483e43f72a878bfa6d81e0b42b9aaf17f7045b073b0cee81f6b58f576b3dad20c360ab1647c90f1a09c94cf36e47412c9c1b302719762ab69a966d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryoptics.code.tex \
texlive-tikz-optics"

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
