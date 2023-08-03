SUMMARY = "Typeset units"
DESCRIPTION = "The package is provided as a bundle with the nicefrac package \
for typing fractions. Units uses nicefrac in typesetting \
physical units in a standard-looking sort of way."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9bsvn42428"

RPM_NAME = "texlive-units-2023.209.0.0.9bsvn42428-54.1.noarch.rpm"
RPM_HASH = "810c355062c5603dd8320e559477d2234b888a0212a49482fa40b0d6751dbd20f4021348feb066a83f36be07f532ba4420b5719f5ec21b30bac5e5edc22dace0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nicefrac.sty \
tex-units.sty \
texlive-units"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
