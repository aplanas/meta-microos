SUMMARY = "A modern interface for the Euler math fonts"
DESCRIPTION = "This package provides the 'eulerpx' font, which started as a \
hybrid of multiple other font packages, notably eulervm and \
newpxmath. This package was put together with the intent to use \
it with the Palatino and Optima fonts, but it may work with \
other combinations, too."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63967"

RPM_NAME = "texlive-eulerpx-2023.209.1.0svn63967-53.1.noarch.rpm"
RPM_HASH = "1c733a4356d1c959224ff4f119554fa9c4c9a145b2dc0d1559595ac877bb8c59f56597ae9f2c38409b6adae6ca71d192f22be37f96dcf1e180fb630f1a651ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eulerpx.sty \
texlive-eulerpx"

RDEPENDS:${PN} += "/usr/bin/sh \
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
