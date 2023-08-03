SUMMARY = "Align terms and members in math expressions"
DESCRIPTION = "This package allows to align terms and members between lines \
containing math expressions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn56966"

RPM_NAME = "texlive-autoaligne-2023.209.1.5svn56966-54.1.noarch.rpm"
RPM_HASH = "e55ed942e618c6a4adc467e18688f23cdcdcfc45a25cac47f3f486fafc201091d1f7d64a8e0f62588f15cd76d7e492d042572a6696d69de57b1ee74a0d8fe758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autoaligne-fr.tex \
tex-autoaligne.sty \
tex-autoaligne.tex \
texlive-autoaligne"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
