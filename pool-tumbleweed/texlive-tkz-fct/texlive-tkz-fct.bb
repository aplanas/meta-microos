SUMMARY = "Tools for drawing graphs of functions"
DESCRIPTION = "The tkz-fct package is designed to give math teachers (and \
students) easy access to programming graphs of functions with \
TikZ and gnuplot."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7csvn61949"

RPM_NAME = "texlive-tkz-fct-2023.209.1.7csvn61949-53.1.noarch.rpm"
RPM_HASH = "f0fdaa1d7ee3a1d6ffd73166f0e986f7f5525e22492d17a499d1c163e0ab3d497c0c7adf857c3f8f5fac12592b2c8b8c672a2438a7dc2cb2d2e39bb3e9632f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-fct.sty \
texlive-tkz-fct"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-tkz-base.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
