SUMMARY = "Font for graphical symbols used in crystallography"
DESCRIPTION = "The font is provided as an Adobe Type 1 font, and as Metafont \
source. Instructions for use are available both in the README \
file and (with a font diagram) in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-cryst-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "ec6ef26f7b28dd1e839d246f82e12a05f9438b82b7de8f5f79c005091c7455998d36e551a0dbfa4c3dac393281b35bc778f11cc788f52f7f344516b8d6bacaa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cryst.tfm \
texlive-cryst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cryst-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
