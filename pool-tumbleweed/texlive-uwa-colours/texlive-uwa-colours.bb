SUMMARY = "The colour palette of The University of Western Australia"
DESCRIPTION = "This package uses the xcolor package to define macros for the \
colour palette of The University of Western Australia."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn60443"

RPM_NAME = "texlive-uwa-colours-2023.201.1.0.0svn60443-53.1.noarch.rpm"
RPM_HASH = "3504cb7e8e4369f2ee6897baf7ffecf01686aed7236f6ccc215986a027f5330a42b1f80d135beacf7d6c134e42dd1a9ac01c9e9015da0ea7f629de40377355e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uwa-colours.sty) \
texlive-uwa-colours"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
