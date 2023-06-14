SUMMARY = "Extend beamer and a0poster for custom sized posters"
DESCRIPTION = "The package enables the user to use beamer style operations on \
a canvas of the sizes provided by a0poster; font scaling is \
available (using packages such as type1cm if necessary). In \
addition, the package allows the user to benefit from the nice \
colour box handling and alignment provided by the beamer class \
(for example, with rounded corners and shadows). Good looking \
posters may be created very rapidly. Features include: scalable \
fonts using the fp and type1cm packages; posters in A-series \
sizes, and custom sizes like double A0 are possible; still \
applicable to custom beamer slides, e.g. 16:9 slides for a \
wide-screen (i.e. 1.78 aspect ratio); orientation may be \
portrait or landscape; a 'debug mode' is provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.13svn54512"

RPM_NAME = "texlive-beamerposter-2023.201.1.13svn54512-53.1.noarch.rpm"
RPM_HASH = "c903d326e76a9c93f3bfd5805ac6f7adcc75bb5906ddd537babe50ecba83037026abf6bc1ae142bce7c576e7f908e0b3a32bae78a7c4c91b9f19723ae2d1d642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerposter.sty \
tex-beamerthemeAachen.sty \
tex-beamerthemeI6dv.sty \
tex-beamerthemeI6pd.sty \
tex-beamerthemeI6pd2.sty \
tex-beamerthemeI6td.sty \
tex-beamerthemeZH.sty \
texlive-beamerposter"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-type1cm.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
