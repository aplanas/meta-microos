SUMMARY = "Fonts for typesetting classical greek"
DESCRIPTION = "These fonts are derivatives of Kunth's CM fonts. Macros for use \
with Plain TeX are included in the package; for use with LaTeX, \
see lgreek (with English documentation) or levy (with German \
documentation)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn21750"

RPM_NAME = "texlive-levy-2023.209.svn21750-55.1.noarch.rpm"
RPM_HASH = "03b5d0fce8e957cc3276b1bbff2e2156d50d0922695fa6fc2d6b5534c7da78364d742fb1e679a099b917388dc6c2d32a70f9c749ae566006f7a8aaae920edbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grbld10.tfm \
tex-grbld8.tfm \
tex-grbld9.tfm \
tex-greekmacros.tex \
tex-grreg10.tfm \
tex-grreg8.tfm \
tex-grreg9.tfm \
tex-slgreek.sty \
texlive-levy"

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
