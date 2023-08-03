SUMMARY = "Provides cover page and affirmation at the end of a thesis"
DESCRIPTION = "Institutions require a cover page and an affirmation at the end \
of a thesis. This package provides both."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0.2svn47923"

RPM_NAME = "texlive-scientific-thesis-cover-2023.209.4.0.2svn47923-54.1.noarch.rpm"
RPM_HASH = "d802109786d98b4f3383fbb8653735b561fd62867f0c31e0dbc65ccccd1b603adc0273470fbfba1d796f57fa7cc721c923ef324604fcd0e28182278c380fcd7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scientific-thesis-cover.sty \
texlive-scientific-thesis-cover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
