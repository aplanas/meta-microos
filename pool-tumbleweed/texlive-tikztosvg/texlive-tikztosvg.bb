SUMMARY = "A utility for rendering TikZ diagrams to SVG"
DESCRIPTION = "This package provides a shell script that calls XeTeX and \
pdf2svg to convert TikZ environments to SVG files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3.0svn60289"

RPM_NAME = "texlive-tikztosvg-2023.209.0.0.3.0svn60289-53.1.noarch.rpm"
RPM_HASH = "87083b268d0822ac57db8dde490bf25e0de4299fed09437e96b560adcfdc76b2799dad0541c35408dbb6b0b6071b7d1939f1afbf087b4edb501cce30bdd85545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikztosvg"

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
texlive-scripts-bin \
texlive-tikztosvg-bin"

inherit rpm
