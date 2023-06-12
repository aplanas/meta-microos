SUMMARY = "Babel support for Finnish"
DESCRIPTION = "The package provides a language description file that enables \
support of Finnish with babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3ssvn57643"

RPM_NAME = "texlive-babel-finnish-2023.201.1.3ssvn57643-53.1.noarch.rpm"
RPM_HASH = "15652d4883874203c47950f4c089e2b09bdcf875666b32f4715125cef23aedb9b9b1a933683eee9bb41388b8b88dc3f5bddc56e74604637f2d33cdacbf52c6a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(finnish.ldf) \
texlive-babel-finnish"
RDEPENDS:${PN} += "/bin/sh \
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
