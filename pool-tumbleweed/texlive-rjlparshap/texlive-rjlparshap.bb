SUMMARY = "Support for use of \\parshape in LaTeX"
DESCRIPTION = "The package provides macros and environments that relieve the \
programmer of some of the difficulties of using \\parshape in \
LaTeX macros. It does not actually calculate shapes in the way \
that the shapepar package does."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "7b5005757757778f2bc4d4b2c55d1a24d1a97683fd69ad38cae9608f6605fed1bad09b998bf53ca7114568ce753ed3498f3b96e3af571ff1c6029d64b2cc10d6"
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
