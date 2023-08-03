SUMMARY = "Extended version of Knuth's logo typeface"
DESCRIPTION = "The fetamont typeface was designed in Metafont and extends the \
Logo fonts to complete the T1 encoding. The designs of the \
glyphs A, E, F, M, N, O, P, S and T are based on the Metafont \
constructions by D. E. Knuth. The glyphs Y and 1 imitate the \
shapes of the corresponding glyphs in the METATYPE1 logo."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43812"

RPM_NAME = "texlive-fetamont-2023.209.svn43812-53.1.noarch.rpm"
RPM_HASH = "fe6002a90fc6854f3ffbf02a1418c00c4bf3c5394f86b37f04aa4f2fb46cf883ad8d0442322d9ccecf2f7fe26f459c29a2b4c80ad1da8e9abda1f57518e88316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-T1ffm.fd \
tex-T1ffmw.fd \
tex-fetamont.map \
tex-fetamont.sty \
tex-ffmb10.tfm \
tex-ffmb8.tfm \
tex-ffmb9.tfm \
tex-ffmbc40.tfm \
tex-ffmbco40.tfm \
tex-ffmbo10.tfm \
tex-ffmbo8.tfm \
tex-ffmbo9.tfm \
tex-ffmbw10.tfm \
tex-ffmbwo10.tfm \
tex-ffmc10.tfm \
tex-ffmco10.tfm \
tex-ffmh10.tfm \
tex-ffmh8.tfm \
tex-ffmh9.tfm \
tex-ffmho10.tfm \
tex-ffmho8.tfm \
tex-ffmho9.tfm \
tex-ffmhw10.tfm \
tex-ffmhwo10.tfm \
tex-ffml10.tfm \
tex-ffmlc10.tfm \
tex-ffmlco10.tfm \
tex-ffmlo10.tfm \
tex-ffmlq10.tfm \
tex-ffmlqo10.tfm \
tex-ffmlw10.tfm \
tex-ffmlwo10.tfm \
tex-ffmo10.tfm \
tex-ffmo8.tfm \
tex-ffmo9.tfm \
tex-ffmr10.tfm \
tex-ffmr8.tfm \
tex-ffmr9.tfm \
tex-ffmw10.tfm \
tex-ffmwo10.tfm \
texlive-fetamont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-fetamont-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
