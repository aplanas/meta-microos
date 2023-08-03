SUMMARY = "Slide Deck Animation"
DESCRIPTION = "With the help of this package you can simulate animation in \
your slide deck, making it look similar to what PowerPoint can \
do."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn64602"

RPM_NAME = "texlive-clicks-2023.209.0.0.4.1svn64602-54.1.noarch.rpm"
RPM_HASH = "bf0af95d314fd3fa54303398e1e8da57a68b25886cb990ddc55046f2b3162609e046f457425693fdcff8d61e9c98e77005ea537c9501ebde801bfbe3a40eb91c"
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
