SUMMARY = "Draw histograms with the LaTeX picture environment"
DESCRIPTION = "This is a collection pf macros to draw histogram bars inside a \
LaTeX picture-environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-histogr-2023.209.1.01svn15878-54.2.noarch.rpm"
RPM_HASH = "f0b375169604193d65032e905258e939a851d021a4f4715e8b9877f394a8289f555de982889064a646f12c6bf9623f5150d0680224cc67289c0e0da94ddb9003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-histogr.sty \
texlive-histogr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
