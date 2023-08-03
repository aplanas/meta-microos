SUMMARY = "Access to the 'frimurer' cipher for use with LaTeX"
DESCRIPTION = "This package provides access to the 'frimurer' cipher for use \
with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn56704"

RPM_NAME = "texlive-frimurer-2023.209.1svn56704-53.1.noarch.rpm"
RPM_HASH = "5656ecb85e9bd797630344e0c64dffbc3a3e3f39b65f285e60ea07bfbdfc93d971dd0ee1bc0c8aee5cc855dee0715a167f7b574847d6827441223f29b18da0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frimurer.enc \
tex-frimurer.sty \
tex-frimurer.tfm \
texlive-frimurer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-frimurer-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
