SUMMARY = "Typeset drama plays"
DESCRIPTION = "The package provides tools to typeset drama plays. It defines \
commands to introduce characters' lines, to render stage \
directions, to divide a play into acts and scenes and to build \
the dramatis personae automatically."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13asvn65249"

RPM_NAME = "texlive-thalie-2023.209.0.0.13asvn65249-55.1.noarch.rpm"
RPM_HASH = "7b0a44c4b665fd4e3ebc1fb7071f33a63bea2145cd7829a45ba51a244fcd86ca811e8d1e05c80602fd0776526dc9ed389028f246260d1e48b8aefb702c6209e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thalie.sty \
texlive-thalie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-suffix.sty \
tex-tabularx.sty \
tex-translations.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
