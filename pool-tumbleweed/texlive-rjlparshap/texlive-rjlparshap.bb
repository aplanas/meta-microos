SUMMARY = "Support for use of \\parshape in LaTeX"
DESCRIPTION = "The package provides macros and environments that relieve the \
programmer of some of the difficulties of using \\parshape in \
LaTeX macros. It does not actually calculate shapes in the way \
that the shapepar package does."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "c57e59ce84e17f4a8e5972f023c8efedb5a9f7088d8130cc0caa5b9a72a52555427ab05c1fa5a395170c2f92130e9193c619c62b6ba99df3303598c3f1d266be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rjlpshap.sty \
texlive-rjlparshap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arrayjob.sty \
tex-forloop.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
