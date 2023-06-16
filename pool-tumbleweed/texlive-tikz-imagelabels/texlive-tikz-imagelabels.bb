SUMMARY = "Put labels on images using TikZ"
DESCRIPTION = "This package allows to add label texts to an existing image \
with the aid of TikZ. This may be used to label certain \
features in an image."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn51490"

RPM_NAME = "texlive-tikz-imagelabels-2023.201.0.0.2svn51490-52.1.noarch.rpm"
RPM_HASH = "8b87e6d2ca0410ca719f0b38e6cc00d6383e74e2f3170fbaddfa17eb42b869449ee93a13c54432de11260c03036770f9b44ee1c56649c3456eadaad83792cb56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-imagelabels.sty \
texlive-tikz-imagelabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
