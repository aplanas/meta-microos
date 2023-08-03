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

PV = "2023.209.1.13svn54512"

RPM_NAME = "texlive-beamerposter-2023.209.1.13svn54512-54.1.noarch.rpm"
RPM_HASH = "ed89fd0b6272a05680d1ada61e70c215a12dad95c125c5bae4ce8652e3d90222a77fbe86c5727dd8e397c23d0fb591f64916a44f91791afa73ca861ab1c402d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerposter.sty \
tex-beamerthemeAachen.sty \
tex-beamerthemeI6dv.sty \
tex-beamerthemeI6pd.sty \
tex-beamerthemeI6pd2.sty \
tex-beamerthemeI6td.sty \
tex-beamerthemeZH.sty \
texlive-beamerposter"

RDEPENDS:${PN} += "/usr/bin/sh \
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
