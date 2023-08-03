SUMMARY = "Easy generation of FAST diagrams"
DESCRIPTION = "The package provides simple means of producing FAST diagrams, \
using TikZ/pgf tools. FAST diagrams are useful for functional \
analysis techniques in design methods."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn29264"

RPM_NAME = "texlive-fast-diagram-2023.209.1.1svn29264-53.1.noarch.rpm"
RPM_HASH = "35e25f24d91d4885ecf7b45372d28b96eccedea4af08c0e8c4f197caef68239225e6c13ac752f92ff277ccdcbb78307b97a96fb511e1ef54e6fd87646a00c9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fast-diagram.sty \
texlive-fast-diagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-relsize.sty \
tex-tikz.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
