SUMMARY = "Interface between foiltex and LaTeX2HTML"
DESCRIPTION = "Provides integration between FoilTeX and LaTeX2HTML, adding \
sectioning commands and elements of logical formatting to \
FoilTeX and providing support for FoilTeX commands in \
LaTeX2HTML."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-foilhtml-2023.201.1.2svn61937-52.1.noarch.rpm"
RPM_HASH = "74ca9d14e423455dfc209fb7e8e66b3134cec1b452075c951d14b3d0cbf57680ccab9975420830183934600d696c1f9681df49b889eb9e9706bb6eb84758e709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(foilhtml.cfg) \
tex(foilhtml.sty) \
texlive-foilhtml"

RDEPENDS:${PN} += "/bin/sh \
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
