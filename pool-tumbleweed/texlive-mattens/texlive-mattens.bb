SUMMARY = "Matrices/tensor typesetting"
DESCRIPTION = "The mattens package contains the definitions to typeset \
matrices, vectors and tensors as used in the engineering \
community for the representation of common vectors and tensors \
such as forces, velocities, moments of inertia, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3bsvn62326"

RPM_NAME = "texlive-mattens-2023.201.1.3bsvn62326-52.1.noarch.rpm"
RPM_HASH = "a6f96248e50f8bbda7399027ca04e904cb2f7ec8a140b13db2a9ea7eb17348f56800ff0adb140bf930092af0f633456a1125b429f9cfbb3a99c8485775f1ccbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mattens.sty \
texlive-mattens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
