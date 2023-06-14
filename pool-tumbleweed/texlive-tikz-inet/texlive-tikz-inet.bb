SUMMARY = "Draw interaction nets with TikZ"
DESCRIPTION = "The package extends TikZ with macros to draw interaction nets."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-tikz-inet-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "c8f6e1dfb980565e5435c62ae9d3ddc9990bfa3422f6f4bbad09887969cde2504572f8292a9bd62f3979df62fa29fb15cbb3bcc5b5f90be4e7ce8384fe96897e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-inet.sty \
texlive-tikz-inet"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
