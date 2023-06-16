SUMMARY = "Slide Deck Animation"
DESCRIPTION = "With the help of this package you can simulate animation in \
your slide deck, making it look similar to what PowerPoint can \
do."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn64602"

RPM_NAME = "texlive-clicks-2023.201.0.0.4.1svn64602-53.1.noarch.rpm"
RPM_HASH = "aea11fcaabe4dcc3fb57b6e0d0dc997fcfe0be5090c78a35d5068510c0c00e10cbbc495e3a60dbaa788e148d59783122c37e5e9e14445a84a25b26e597d968f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clicks.sty \
texlive-clicks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xkeyval.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
