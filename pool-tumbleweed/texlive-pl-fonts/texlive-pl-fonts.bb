SUMMARY = "Severed fonts for texlive-pl"
DESCRIPTION = "The  separated fonts package for texlive-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.09asvn58661"

RPM_NAME = "texlive-pl-fonts-2023.209.1.09asvn58661-52.1.noarch.rpm"
RPM_HASH = "7474e2d2e5bf7f6f94cb74aceb8b0e54618c9d47db00bac1f37f96011afc65c1e40908bd0110079478ae198d758a6904604f6837790570ffcc507f6a87461c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=pl \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-plcaps10 \
font-pldunhill10 \
font-plfibonacci8 \
font-plfunny10 \
font-plinch \
font-plmathextension10 \
font-plmathextension9 \
font-plmathitalic10 \
font-plmathitalic12 \
font-plmathitalic5 \
font-plmathitalic6 \
font-plmathitalic7 \
font-plmathitalic8 \
font-plmathitalic9 \
font-plmathsymbols10 \
font-plmathsymbols5 \
font-plmathsymbols6 \
font-plmathsymbols7 \
font-plmathsymbols8 \
font-plmathsymbols9 \
font-plroman10 \
font-plroman12 \
font-plroman17 \
font-plroman5 \
font-plroman6 \
font-plroman7 \
font-plroman8 \
font-plroman9 \
font-plromandemi10 \
font-plsans10 \
font-plsans12 \
font-plsans17 \
font-plsans8 \
font-plsans9 \
font-plsansdemicond10 \
font-plsansquotation8 \
font-plslanted10 \
font-plslanted12 \
font-plslanted8 \
font-plslanted9 \
font-pltexextended10 \
font-pltexextended8 \
font-pltexextended9 \
font-pltypewriter10 \
font-pltypewriter12 \
font-pltypewriter8 \
font-pltypewriter9 \
font-pltypewritercaps10 \
font-pltypewriterslanted10 \
font-pltypewritervarwd10 \
font-plunslanted10 \
texlive-pl-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
