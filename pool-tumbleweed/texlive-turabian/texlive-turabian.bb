SUMMARY = "Create Turabian-formatted material using LaTeX"
DESCRIPTION = "The bundle provides a class file and a template for creating \
Turabian-formatted projects. The class file supports citation \
formatting conforming to the Turabian 8th Edition style guide."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn36298"

RPM_NAME = "texlive-turabian-2023.209.0.0.1.0svn36298-53.1.noarch.rpm"
RPM_HASH = "5610e96c630c1bdf6366ce8858b0a9ada10dcf8dc2cd03c7b6424bb92e2a8e85efff76d0ff7c3545b73a196879ac9fa3ba349c5f4782997be15ab3a2d5f17fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turabian.cls \
texlive-turabian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-cjhebrew.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyphenat.sty \
tex-indentfirst.sty \
tex-lipsum.sty \
tex-report.cls \
tex-scrextend.sty \
tex-setspace.sty \
tex-times.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
