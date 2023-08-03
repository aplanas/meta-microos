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

PV = "2023.209.2.3svn43442"

RPM_NAME = "texlive-tikz-palattice-2023.209.2.3svn43442-53.1.noarch.rpm"
RPM_HASH = "2f5a9b2b0c0ec0f72429022215776988dd02710c83bbe32b7e0b04f36148bc4eb3561bb204c3038a81b4fb28cbd9e8bb4523290cd217ef40f37586c4420f27c1"
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
