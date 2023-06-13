SUMMARY = "Sans-serif mathematics"
DESCRIPTION = "sfmath is a simple package for sans serif maths in documents. \
After including the package, all maths of the current document \
is displayed with sans serif fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn15878"

RPM_NAME = "texlive-sfmath-2023.201.0.0.8svn15878-53.1.noarch.rpm"
RPM_HASH = "63e6331bdbf3d29d86a3c3b59d223154365be41f6fe6e7d05bc2941637082c60bab406db7673812c6bec411e558cfac6344bfc068aacd9f894dd3599942bfab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sfmath.sty) \
texlive-sfmath"

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
