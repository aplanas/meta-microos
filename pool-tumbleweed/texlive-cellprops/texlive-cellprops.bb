SUMMARY = "Accept CSS-like selectors in tabular, array,"
DESCRIPTION = "This package reworks the internals of tabular, array, and \
similar constructs, and adds a \\cellprops command accepting \
CSS-like selectors and properties. It depends on mdwtab, \
xcolor, expl3, and xparse."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0svn57599"

RPM_NAME = "texlive-cellprops-2023.209.2.0svn57599-53.1.noarch.rpm"
RPM_HASH = "d003f04d1b327c4d74582b94618c9867f6f61b0cbd240f6937b166094ac98e3d5d822acac1e1d90d13721eb4417e11a207c03183a2c1d351afc22e6a5784f5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cellprops.sty \
texlive-cellprops"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-mdwtab.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
