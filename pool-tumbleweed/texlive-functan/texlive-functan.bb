SUMMARY = "Macros for functional analysis and PDE theory"
DESCRIPTION = "This package provides a convenient and coherent way to deal \
with name of functional spaces (mainly Sobolev spaces) in \
functional analysis and PDE theory. It also provides a set of \
macros for dealing with norms, scalar products and convergence \
with some object oriented flavor (it gives the possibility to \
override the standard behavior of norms, ...)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-functan-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "08cf2106c4d40a15f40da8aab72d9ec0f9f62662735c20de3c374737371b3bc5054d83ed5480324be877305d1ae6ed400bc9345d6b59a895121096bf3fd2b0c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-functan.sty \
texlive-functan"

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
