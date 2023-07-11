SUMMARY = "High level patching of commands"
DESCRIPTION = "The package generalises the macro patching commands provided by \
P. Lehmann's etoolbox. The difference between this package and \
its sibling xpatch is that this package sports a very powerful \
\\regexpatchcmd based on the l3regex module of the LaTeX3 \
experimental packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-2023.201.0.0.2fsvn58668-53.2.noarch.rpm"
RPM_HASH = "34b7141a4998552858a0cde8281dd63740225a41e6bf0106a27fa73c4a2139d08554daf136ed199c26f928735cba53981b79fa3f7b052b08996869f9962a0b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regexpatch.sty \
texlive-regexpatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
