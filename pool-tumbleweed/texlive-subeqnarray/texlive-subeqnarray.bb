SUMMARY = "Equation array with sub numbering"
DESCRIPTION = "This package defines the subeqnarray and subeqnarray* \
environments, which behave like the corresponding eqnarray and \
eqnarray* environments, except that the individual lines are \
numbered like 1a, 1b, 1c, etc. To refer to these numbers an \
extra label command \\slabel is provided. Users are urged to \
consider the alignment capabilities of the amsmath bundle, \
which produce better results than eqnarray-related macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1csvn15878"

RPM_NAME = "texlive-subeqnarray-2023.209.2.1csvn15878-58.1.noarch.rpm"
RPM_HASH = "459a6c4ec9f435a2e567d595c7fdf64c3eadf9434f2b40ac7838e79d908b22854319f61fee7905a6667cb6ed14e86dab0abade5ff06cbbc658a7b7d3c08d4bcf"
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
