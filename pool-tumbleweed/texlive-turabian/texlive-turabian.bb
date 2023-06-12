SUMMARY = "Create Turabian-formatted material using LaTeX"
DESCRIPTION = "The bundle provides a class file and a template for creating \
Turabian-formatted projects. The class file supports citation \
formatting conforming to the Turabian 8th Edition style guide."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn36298"

RPM_NAME = "texlive-turabian-2023.201.0.0.1.0svn36298-52.1.noarch.rpm"
RPM_HASH = "272b3ecccf08f040e713b61a5ab69417c696543b10f42e63fc69a964f573bb474c83ba848fe838825e4ddefdae91040b63ebbc9bdc42c28193a8973134f7735d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(turabian.cls) \
texlive-turabian"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(cjhebrew.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyphenat.sty) \
tex(indentfirst.sty) \
tex(lipsum.sty) \
tex(report.cls) \
tex(scrextend.sty) \
tex(setspace.sty) \
tex(times.sty) \
tex(titlesec.sty) \
tex(tocloft.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
