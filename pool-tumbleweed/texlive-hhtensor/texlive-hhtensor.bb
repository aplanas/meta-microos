SUMMARY = "Print vectors, matrices, and tensors"
DESCRIPTION = "This package provides commands for vectors, matrices, and \
tensors with different styles -- arrows (as the LaTeX default), \
underlined, and bold."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-2023.201.0.0.61svn54080-53.1.noarch.rpm"
RPM_HASH = "9183ca02b9a07c0071618533befd8f413301c8f6561f31d2acbdcd02662c0c51ad3383b8564bf6d9f1d4d624f63f6d03bb18048d585560bed324a9d84e5a72ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hhtensor.sty \
texlive-hhtensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ushort.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
