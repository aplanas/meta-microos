SUMMARY = "A PSTricks package for tilting and other pseudo-3D tricks"
DESCRIPTION = "The package provides basic macros that use PSTricks for \
shadows, tilting and three dimensional representations of text \
or graphical objects."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn17257"

RPM_NAME = "texlive-pst-3d-2023.201.1.10svn17257-52.1.noarch.rpm"
RPM_HASH = "3b35f577bc66574ad481710023beba4caf4a68bf5be2e5c612ae505ecbb9db54d746def8e7646d81a559e0b6bce4d9cb6750c2a75cdd4544a67d139f897184e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-3d.sty) \
tex(pst-3d.tex) \
texlive-pst-3d"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
