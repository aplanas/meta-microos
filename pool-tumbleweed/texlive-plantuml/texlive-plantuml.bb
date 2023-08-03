SUMMARY = "Support for rendering UML diagrams using the syntax and tool of PlantUML"
DESCRIPTION = "The package provides support for rendering UML diagrams using \
the syntax and tools of PlantUML. The PlantUML syntax is very \
short and thus enables quickly specifying UML diagrams. Using \
dot, PlantUML layouts the diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1svn55214"

RPM_NAME = "texlive-plantuml-2023.209.0.0.3.1svn55214-52.1.noarch.rpm"
RPM_HASH = "c40229977377358316a6c69b9e50d890b63f944e2c078e0dc09a0f1192a29546330fdf934bf8108f02a238c453589e3e912bb60dd4d9ea321ab53d530e3a1801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plantuml.sty \
texlive-plantuml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-luacode.sty \
tex-pdftexcmds.sty \
tex-pythontex.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
