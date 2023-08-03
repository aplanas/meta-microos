SUMMARY = "Enable integration between MetaPost pictures and LaTeX"
DESCRIPTION = "The package allows integration between MetaPost pictures and \
LaTeX. The main feature is that passing parameters to the \
MetaPost pictures is possible and the picture code can be put \
inside arguments to commands, including \\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21691"

RPM_NAME = "texlive-gmp-2023.209.1.0svn21691-54.1.noarch.rpm"
RPM_HASH = "81263027149bae2fc7dd228ef91337baaaf29ee6d9febff46117fe10919c462ebedca3318896017dde467d329ad8af11ddea3ec1721066c9caca4df1445f02f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmp.sty \
texlive-gmp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
