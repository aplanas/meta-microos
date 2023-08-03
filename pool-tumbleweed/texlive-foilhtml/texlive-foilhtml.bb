SUMMARY = "Interface between foiltex and LaTeX2HTML"
DESCRIPTION = "Provides integration between FoilTeX and LaTeX2HTML, adding \
sectioning commands and elements of logical formatting to \
FoilTeX and providing support for FoilTeX commands in \
LaTeX2HTML."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61937"

RPM_NAME = "texlive-foilhtml-2023.209.1.2svn61937-53.1.noarch.rpm"
RPM_HASH = "9f4a25bfa4908a9860cf5486479891a6d50402e39fb7d4669fbe2772caabbd2dc04af2cc28499e387260483dfbec861295cac669b3b3023d0b274f79c8255974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foilhtml.cfg \
tex-foilhtml.sty \
texlive-foilhtml"

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
