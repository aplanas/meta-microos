SUMMARY = "Macros for functional analysis and PDE theory"
DESCRIPTION = "This package provides a convenient and coherent way to deal \
with name of functional spaces (mainly Sobolev spaces) in \
functional analysis and PDE theory. It also provides a set of \
macros for dealing with norms, scalar products and convergence \
with some object oriented flavor (it gives the possibility to \
override the standard behavior of norms, ...)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-functan-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "d67b633ee09d9266dd91c195a15e3320936a45ed78c971e87ca68c4a7807d3c55c3bd448e476ef98f980b86f528162bd07d5be3efbc75e2036e2c208c5f957fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(functan.sty) \
texlive-functan"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
