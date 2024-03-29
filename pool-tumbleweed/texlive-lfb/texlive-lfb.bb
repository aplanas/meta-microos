SUMMARY = "A Greek font with normal and bold variants"
DESCRIPTION = "This is a Greek font written in Metafont, with inspiration from \
the Bodoni typefaces in old books. It is stylistically a little \
more exotic than the standard textbook Greek fonts, \
particularly in glyphs like the lowercase rho and kappa. It \
aims for a rather calligraphic feel, but seems to blend well \
with Computer Modern. There is a ligature scheme which \
automatically inserts the breathings required for ancient \
texts, making the input text more readable than in some \
schemes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-lfb-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "23b477c70598dae607d7e7aa075806f579d75739fddd829f306a35d2b291e478da6315bdd5bc83a22b51e64064e0841fd1bf9c8b1ed150744db506f1578699cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lfb10.tfm \
tex-lfb11.tfm \
tex-lfb12.tfm \
tex-lfb5.tfm \
tex-lfb6.tfm \
tex-lfb7.tfm \
tex-lfb8.tfm \
tex-lfb9.tfm \
tex-lfbb10.tfm \
tex-lfbb11.tfm \
tex-lfbb12.tfm \
tex-lfbb5.tfm \
tex-lfbb6.tfm \
tex-lfbb7.tfm \
tex-lfbb8.tfm \
tex-lfbb9.tfm \
texlive-lfb"

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
