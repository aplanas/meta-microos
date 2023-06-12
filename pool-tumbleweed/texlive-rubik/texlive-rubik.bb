SUMMARY = "Document Rubik cube configurations and rotation sequences"
DESCRIPTION = "The bundle provides four packages: rubikcube provides commands \
for typesetting Rubik cubes and their transformations, \
rubiktwocube provides commands for typesetting Rubik twocubes \
and their transformations, rubikrotation which can process a \
sequence of Rubik rotation moves, with the help of a Perl \
package executed via \\write18 (shell escape) commands, and \
rubikpatterns, a collection of well known patterns and their \
associated rotation sequences."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn46791"

RPM_NAME = "texlive-rubik-2023.201.5.0svn46791-53.1.noarch.rpm"
RPM_HASH = "e3e491e08aa38cf2b9991c277fcda6fd9ed1011e226c67b1d887b85351dcef58703644c8c56141674bfd339bad2ffbe3cd4285255a6aa1b1eb2c29ad33b30c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rubikcube.sty) \
tex(rubikpatterns.sty) \
tex(rubikrotation.sty) \
tex(rubiktwocube.sty) \
texlive-rubik"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Carp) \
perl(Fatal) \
perl(warnings) \
sed \
tex(fancyvrb.sty) \
tex(forarray.sty) \
tex(ifluatex.sty) \
tex(ifthen.sty) \
tex(shellesc.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rubik-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
