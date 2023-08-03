SUMMARY = "Concrete mathematics fonts"
DESCRIPTION = "The fonts are derived from the computer modern mathematics \
fonts and from Knuth's Concrete Roman fonts; they are \
distributed as Metafont source. LaTeX support is offered by the \
concmath package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17218"

RPM_NAME = "texlive-concmath-fonts-2023.209.svn17218-54.1.noarch.rpm"
RPM_HASH = "5c34ab5bded56e24662c4e4c6cced7a3809b7d565a072e68a2960c49bfe6070c5edc01bd94bef5c19ddaad6b420eed0c27b36099932d79f7d952e4ef3aacdccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xccam10.tfm \
tex-xccam5.tfm \
tex-xccam6.tfm \
tex-xccam7.tfm \
tex-xccam8.tfm \
tex-xccam9.tfm \
tex-xccbm10.tfm \
tex-xccbm5.tfm \
tex-xccbm6.tfm \
tex-xccbm7.tfm \
tex-xccbm8.tfm \
tex-xccbm9.tfm \
tex-xccex10.tfm \
tex-xccex7.tfm \
tex-xccex8.tfm \
tex-xccex9.tfm \
tex-xccmi10.tfm \
tex-xccmi5.tfm \
tex-xccmi6.tfm \
tex-xccmi7.tfm \
tex-xccmi8.tfm \
tex-xccmi9.tfm \
tex-xccsy10.tfm \
tex-xccsy5.tfm \
tex-xccsy6.tfm \
tex-xccsy7.tfm \
tex-xccsy8.tfm \
tex-xccsy9.tfm \
texlive-concmath-fonts"

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
