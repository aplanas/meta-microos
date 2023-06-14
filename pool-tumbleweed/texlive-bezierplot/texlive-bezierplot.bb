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

PV = "2023.201.1.4svn51398"

RPM_NAME = "texlive-bezierplot-2023.201.1.4svn51398-53.1.noarch.rpm"
RPM_HASH = "cd9c0ca27816ae20d9a415193b548dccc7066f198e5dba25bfb6717f3d09a8a9be6440e5d720865106d983353dd562f63c5a9ba54d815ce03fb6dec9961fd03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bezierplot.sty \
texlive-bezierplot"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua \
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
