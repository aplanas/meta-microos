SUMMARY = "Matrices/tensor typesetting"
DESCRIPTION = "The mattens package contains the definitions to typeset \
matrices, vectors and tensors as used in the engineering \
community for the representation of common vectors and tensors \
such as forces, velocities, moments of inertia, etc."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3bsvn62326"

RPM_NAME = "texlive-mattens-2023.208.1.3bsvn62326-53.1.noarch.rpm"
RPM_HASH = "7b24022ef8f4818688da98f74faf21847a151e5722755f3d8fda8937bf74ff06cb91e4df7e0c3ce35ebe9a76b8f20bc194d2ca12cc900a51c2ebe45a3ed8558c"
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
