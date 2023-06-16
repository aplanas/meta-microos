SUMMARY = "Equation array with sub numbering"
DESCRIPTION = "This package defines the subeqnarray and subeqnarray* \
environments, which behave like the corresponding eqnarray and \
eqnarray* environments, except that the individual lines are \
numbered like 1a, 1b, 1c, etc. To refer to these numbers an \
extra label command \\slabel is provided. Users are urged to \
consider the alignment capabilities of the amsmath bundle, \
which produce better results than eqnarray-related macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1csvn15878"

RPM_NAME = "texlive-subeqnarray-2023.201.2.1csvn15878-57.1.noarch.rpm"
RPM_HASH = "2d7a25d19201501e37c3e19c9d38e773b0902eccaa9c8022a122c522b5206a3746b11872653b42aa59818f153a935779a730ccd657b158c225df3931f910da9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subeqnarray.sty \
texlive-subeqnarray"

RDEPENDS:${PN} += "/usr/bin/sh \
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
