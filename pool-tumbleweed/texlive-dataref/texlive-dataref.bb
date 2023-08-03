SUMMARY = "Manage references to experimental data"
DESCRIPTION = "The package provides a mechanism that maintains a fixed \
symbolic reference to numerical results; such results may vary \
as the project proceeds (and hence the project report \
develops)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn62942"

RPM_NAME = "texlive-dataref-2023.209.0.0.7svn62942-55.1.noarch.rpm"
RPM_HASH = "e15f90cdd59ecdfb53b4f794acda200646fd473aff04202119ebd58f84e30e8daeaaef49ed61fb61eb9dc8ea8730d0271e2dc6edc53464bc1f1e3f2ffe503680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dataref.sty \
texlive-dataref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-iftex.sty \
tex-import.sty \
tex-kvoptions.sty \
tex-pdfcomment.sty \
tex-pgf.sty \
tex-xfp.sty \
tex-xtab.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
