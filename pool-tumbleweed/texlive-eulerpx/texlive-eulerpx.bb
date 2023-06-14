SUMMARY = "A modern interface for the Euler math fonts"
DESCRIPTION = "This package provides the 'eulerpx' font, which started as a \
hybrid of multiple other font packages, notably eulervm and \
newpxmath. This package was put together with the intent to use \
it with the Palatino and Optima fonts, but it may work with \
other combinations, too."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn63967"

RPM_NAME = "texlive-eulerpx-2023.201.1.0svn63967-52.1.noarch.rpm"
RPM_HASH = "550990adf7daca739ce68304e8dd97231a72fb8c662655c6ac1001b61248d4df7736dc32bc7a24523a18976f8f6bde75270d555a74555d73959646b370faf0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eulerpx.sty \
texlive-eulerpx"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-newpxmath.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
