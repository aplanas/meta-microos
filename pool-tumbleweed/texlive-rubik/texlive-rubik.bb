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

PV = "2023.209.5.0svn46791"

RPM_NAME = "texlive-rubik-2023.209.5.0svn46791-54.1.noarch.rpm"
RPM_HASH = "acda30f5e0f80e02a3ea42433cb6b8e999155fc86fe955dc984325bac5e7d8e48a81ee02285a965384602b4fa4b96dc060831c39dcf7cfdbf1dac2f0004a8fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rubikcube.sty \
tex-rubikpatterns.sty \
tex-rubikrotation.sty \
tex-rubiktwocube.sty \
texlive-rubik"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Carp \
perl-Fatal \
perl-warnings \
sed \
tex-fancyvrb.sty \
tex-forarray.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-shellesc.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rubik-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
