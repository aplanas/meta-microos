SUMMARY = "Severed fonts for texlive-mathabx-type1"
DESCRIPTION = "The  separated fonts package for texlive-mathabx-type1"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn21129"

RPM_NAME = "texlive-mathabx-type1-fonts-2023.208.svn21129-53.1.noarch.rpm"
RPM_HASH = "7bef1f196c638a94be7bd8721a42d23cbcd30dc806a5afbdb9c4e4f81fdd8bdea196fa5817609c1e6b2a31d2e38baccd36c9b850d38da7729756640c0c3acc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=da \
font--lang=de \
font--lang=en \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fr \
font--lang=fur \
font--lang=fy \
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=mg \
font--lang=ms \
font--lang=nb \
font--lang=nds \
font--lang=ng \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
font--lang=sk \
font--lang=sma \
font--lang=smj \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-texmatha10 \
font-texmatha12 \
font-texmatha5 \
font-texmatha6 \
font-texmatha7 \
font-texmatha8 \
font-texmatha9 \
font-texmathastrotest10 \
font-texmathb10 \
font-texmathb12 \
font-texmathb5 \
font-texmathb6 \
font-texmathb7 \
font-texmathb8 \
font-texmathb9 \
font-texmathc10 \
font-texmathu10 \
font-texmathux10 \
font-texmathx10 \
font-texmathx12 \
font-texmathx5 \
font-texmathx6 \
font-texmathx7 \
font-texmathx8 \
font-texmathx9 \
texlive-mathabx-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
