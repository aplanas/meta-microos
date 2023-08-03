SUMMARY = "Severed fonts for texlive-eurosym"
DESCRIPTION = "The  separated fonts package for texlive-eurosym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4_subrfixsvn17265"

RPM_NAME = "texlive-eurosym-fonts-2023.209.1.4_subrfixsvn17265-53.1.noarch.rpm"
RPM_HASH = "1ed4362bf7925da77bd4aefc057a14e31d5a9ef06c36bf4b73fb3c0ef92a24b11a34ca6d794c61370f6eacad5aef84ddb9a72a5fd150a3f12c77287b0aa01ac2"
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
font-tex\040feybl10 \
font-tex\040feybo10 \
font-tex\040feybr10 \
font-tex\040feyml10 \
font-tex\040feymo10 \
font-tex\040feymr10 \
font-texfeybl10 \
font-texfeybo10 \
font-texfeybr10 \
font-texfeyml10 \
font-texfeymo10 \
font-texfeymr10 \
texlive-eurosym-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
