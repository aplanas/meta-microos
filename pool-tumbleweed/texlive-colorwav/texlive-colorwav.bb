SUMMARY = "Colours by wavelength of visible light"
DESCRIPTION = "The package allows the user to obtain an RGB value (suitable \
for use in the color package) from a wavelength of light. The \
default unit is nanometres, but other units may be used. Note \
that this function is also available within xcolor."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-colorwav-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "68b851976a2aebd894d1f3adb62c8f56ada2ae2002ac8fddb40553f295c18110b798e43485a9f960d4a7461fc6034fa836641466890f8a31195f8ecd408490b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorwav.sty \
texlive-colorwav"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
