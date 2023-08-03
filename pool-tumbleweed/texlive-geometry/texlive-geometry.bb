SUMMARY = "Flexible and complete interface to document dimensions"
DESCRIPTION = "The package provides an easy and flexible user interface to \
customize page layout, implementing auto-centering and \
auto-balancing mechanisms so that the users have only to give \
the least description for the page layout. For example, if you \
want to set each margin 2cm without header space, what you need \
is just \\usepackage[margin=2cm,nohead]{geometry}. The package \
knows about all the standard paper sizes, so that the user need \
not know what the nominal 'real' dimensions of the paper are, \
just its standard name (such as a4, letter, etc.). An important \
feature is the package's ability to communicate the paper size \
it's set up to the output (whether via DVI \\specials or via \
direct interaction with pdf(La)TeX)."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.9svn61719"

RPM_NAME = "texlive-geometry-2023.209.5.9svn61719-53.1.noarch.rpm"
RPM_HASH = "073a82049520817c2b756417c6831b50b017c9d66e8a68377df0995c96686393c93c1093d47eb2f785fe1744dd9c51e06b9e5f75e5a8485b26569d9991bf8e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-geometry.sty \
texlive-geometry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifvtex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-graphics \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
