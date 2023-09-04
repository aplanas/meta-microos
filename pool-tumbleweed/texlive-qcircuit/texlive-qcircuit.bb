SUMMARY = "Macros to generate quantum ciruits"
DESCRIPTION = "The package supports those within the quantum information \
community who typeset quantum circuits, using xy-pic package, \
offering macros designed to help users generate circuits."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-2023.209.2.6.0svn48400-54.2.noarch.rpm"
RPM_HASH = "84d502770004c3c19c83544c82a372e7ffc5972f053efaf52f06ce008f7ebd3f4235d1e0eefe46724a22b1856701275cf81677f7cd3d5e94fb4469141a139b44"
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
