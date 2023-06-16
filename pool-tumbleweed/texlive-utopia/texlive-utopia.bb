SUMMARY = "Adobe Utopia fonts"
DESCRIPTION = "The Adobe Standard Encoding set (upright and italic shapes, \
medium and bold weights) of the Utopia font family, which Adobe \
donated to the X Consortium. Macro support, and maths fonts \
that match the Utopia family, are provided by the Fourier and \
the Mathdesign font packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-utopia-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "5a884440bff655aa8343e1a886f47fb3e9d32822080dc48bd689399255ae6190e61755943a689fccb6e7c5caa46c725611f84fbe2ceb7117de5066c4af924297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-putb7t.tfm \
tex-putb7t.vf \
tex-putb8c.tfm \
tex-putb8c.vf \
tex-putb8r.tfm \
tex-putb8t.tfm \
tex-putb8t.vf \
tex-putbc7t.tfm \
tex-putbc7t.vf \
tex-putbc8t.tfm \
tex-putbc8t.vf \
tex-putbi7t.tfm \
tex-putbi7t.vf \
tex-putbi8c.tfm \
tex-putbi8c.vf \
tex-putbi8r.tfm \
tex-putbi8t.tfm \
tex-putbi8t.vf \
tex-putbo7t.tfm \
tex-putbo7t.vf \
tex-putbo8c.tfm \
tex-putbo8c.vf \
tex-putbo8r.tfm \
tex-putbo8t.tfm \
tex-putbo8t.vf \
tex-putr7t.tfm \
tex-putr7t.vf \
tex-putr8c.tfm \
tex-putr8c.vf \
tex-putr8r.tfm \
tex-putr8t.tfm \
tex-putr8t.vf \
tex-putrc7t.tfm \
tex-putrc7t.vf \
tex-putrc8t.tfm \
tex-putrc8t.vf \
tex-putri7t.tfm \
tex-putri7t.vf \
tex-putri8c.tfm \
tex-putri8c.vf \
tex-putri8r.tfm \
tex-putri8t.tfm \
tex-putri8t.vf \
tex-putro7t.tfm \
tex-putro7t.vf \
tex-putro8c.tfm \
tex-putro8c.vf \
tex-putro8r.tfm \
tex-putro8t.tfm \
tex-putro8t.vf \
texlive-utopia"

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
texlive-scripts-bin \
texlive-utopia-fonts"

inherit rpm
