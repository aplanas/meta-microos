SUMMARY = "Severed fonts for texlive-cs"
DESCRIPTION = "The  separated fonts package for texlive-cs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn41553"

RPM_NAME = "texlive-cs-fonts-2023.209.svn41553-55.1.noarch.rpm"
RPM_HASH = "3b88931b6401f1414a13b3ad05e7b46b184d46423efec205ed431e4b6347f0a2b00ed5f7967501b2dd374e2828d32bbbc491db37b36b7537387e1f54e4b77c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=cs \
font--lang=de \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=mg \
font--lang=ms \
font--lang=nds \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sk \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-csb10 \
font-csbx10 \
font-csbx12 \
font-csbx5 \
font-csbx6 \
font-csbx7 \
font-csbx8 \
font-csbx9 \
font-csbxsl10 \
font-csbxti10 \
font-cscsc10 \
font-csdunh10 \
font-csff10 \
font-csfi10 \
font-csfib8 \
font-csinch \
font-csitt10 \
font-csr10 \
font-csr12 \
font-csr17 \
font-csr5 \
font-csr6 \
font-csr7 \
font-csr8 \
font-csr9 \
font-cssl10 \
font-cssl12 \
font-cssl8 \
font-cssl9 \
font-cssltt10 \
font-csss10 \
font-csss12 \
font-csss17 \
font-csss8 \
font-csss9 \
font-csssbx10 \
font-csssdc10 \
font-csssi10 \
font-csssi12 \
font-csssi17 \
font-csssi8 \
font-csssi9 \
font-csssq8 \
font-csssqi8 \
font-cstcsc10 \
font-csti10 \
font-csti12 \
font-csti7 \
font-csti8 \
font-csti9 \
font-cstt10 \
font-cstt12 \
font-cstt8 \
font-cstt9 \
font-csu10 \
font-csvtt10 \
texlive-cs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
