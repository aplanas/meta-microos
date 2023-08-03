SUMMARY = "Approximate smooth function graphs with cubic bezier splines for use with TikZ or MetaPost"
DESCRIPTION = "This package consists of a Lua program as well as a (Lua)LaTeX \
.sty file. Given a smooth function, bezierplot returns a smooth \
bezier path written in TikZ notation (which also matches \
MetaPost) that approximates the graph of the function. For \
polynomial functions of degree [?] 3 and their inverses the \
approximation is exact (up to numeric precision). bezierplot \
also finds special points such as extreme points and inflection \
points and reduces the number of used points."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn51398"

RPM_NAME = "texlive-bezierplot-2023.209.1.4svn51398-54.1.noarch.rpm"
RPM_HASH = "2b6d5a2fec83a68a740652595a4ed528ac27278874aadd7f95a944116daa7e597e8f2fc927c45fd25e4d230d25284446839927a6a7fa8a3e6dc0b37453ac0f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bezierplot.sty \
texlive-bezierplot"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
