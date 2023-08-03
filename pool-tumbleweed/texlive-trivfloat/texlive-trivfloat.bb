SUMMARY = "Quick float definitions in LaTeX"
DESCRIPTION = "The trivfloat package provides a quick method for defining new \
float types in LaTeX. A single command sets up a new float in \
the same style as the LaTeX kernel figure and table float \
types. The package works with memoir as well as the standard \
classes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3bsvn15878"

RPM_NAME = "texlive-trivfloat-2023.209.1.3bsvn15878-53.1.noarch.rpm"
RPM_HASH = "6695c70770e826f134ecd5120316bbffb40e60ee32e414700883cbec91944172c2600f583be06cfee115c6c2da5926fd0311cbdb9b114fbfb00546f744c08d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trivfloat.sty \
texlive-trivfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-floatrow.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
