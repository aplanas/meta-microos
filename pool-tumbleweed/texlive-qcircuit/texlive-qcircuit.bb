SUMMARY = "Macros to generate quantum ciruits"
DESCRIPTION = "The package supports those within the quantum information \
community who typeset quantum circuits, using xy-pic package, \
offering macros designed to help users generate circuits."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-2023.209.2.6.0svn48400-54.1.noarch.rpm"
RPM_HASH = "834605c884c29be9ffb75f7b0e521f922a5779204124c8b6c9410e34564c8cbce5527f95b90a84551fb10dd34e0fc21033e72b2532614c3c16182978b7eb4241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qcircuit.sty \
texlive-qcircuit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
