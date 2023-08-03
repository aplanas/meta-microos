SUMMARY = "Spherical Mercator coordinate systems and Web Mercator tile integration"
DESCRIPTION = "This package extends TikZ with tools to create map graphics. \
The provided coordinate system relies on the Web Mercator \
projection used on the Web by OpenStreetMap and others. The \
package supports the seamless integration of graphics from \
public map tile servers by a Python script. Also, common map \
elements like markers, geodetic networks, bar scales, routes, \
orthodrome pieces, and more are part of the package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn56060"

RPM_NAME = "texlive-mercatormap-2023.209.1.02svn56060-55.1.noarch.rpm"
RPM_HASH = "9f46e0ad3b0b9ff8e6a1ce23116c9c322261443e1d8af12b42550168df27296779acfcb30456a20b951b73e7905eeef6b1c40ee446c81057aa0f523365bd8fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mercatormap.sty \
tex-mercatorpy.def \
tex-mercatorsupplier.def \
texlive-mercatormap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-graphicx.sty \
tex-pdftexcmds.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
