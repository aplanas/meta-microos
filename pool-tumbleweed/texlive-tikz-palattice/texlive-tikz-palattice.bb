SUMMARY = "Draw particle accelerator lattices with TikZ"
DESCRIPTION = "This package allows for drawing a map of a particle accelerator \
just by giving a list of elements -- similar to lattice files \
for simulation software. The package includes 12 common element \
types like dipoles, quadrupoles, cavities, or screens, as well \
as automatic labels with element names, a legend, a rule, and \
an environment to fade out parts of the accelerator. The \
coordinate of any element can be saved and used for custom TikZ \
drawings or annotations. Thereby, lattices can be connected to \
draw injection/extraction or even a complete accelerator \
facility."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn43442"

RPM_NAME = "texlive-tikz-palattice-2023.201.2.3svn43442-52.1.noarch.rpm"
RPM_HASH = "b22771d77e4c58d33286a0e956bb009079121aeb311615fe047c0600d0ea50c8b36b75ddb687338c268040e78bd027b244da83feb732b88e642f5bb18dc128a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-palattice.sty \
texlive-tikz-palattice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-iflang.sty \
tex-ifthen.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
