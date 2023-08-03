SUMMARY = "A suite of tools for typesetting algorithms in pseudo-code"
DESCRIPTION = "Consists of two environments: algorithm and algorithmic. The \
algorithm package defines a floating algorithm environment \
designed to work with the algorithmic style. Within an \
algorithmic environment a number of commands for typesetting \
popular algorithmic constructs are available."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.1svn42428"

RPM_NAME = "texlive-algorithms-2023.209.0.0.1svn42428-55.1.noarch.rpm"
RPM_HASH = "bce96ea1b408778733c3e69d575e10c2e22263ab9ea5f3446b44919d1373e76ced5a840c37d33ff35b792468108b22d10fb2f98e7d01d1fa4a65402fb5738989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algorithm.sty \
tex-algorithmic.sty \
texlive-algorithms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
