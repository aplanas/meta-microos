SUMMARY = "Severed fonts for texlive-crimson"
DESCRIPTION = "The  separated fonts package for texlive-crimson"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64559"

RPM_NAME = "texlive-crimson-fonts-2023.209.svn64559-55.1.noarch.rpm"
RPM_HASH = "5f8ba33516ab0423cb62443db5713a4646828d585aea2ff485f51d5f96b019085c6e40b396092ab8f4bb0e4d906c906465ae1872405de76b35d236aee1a061b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-crimson-fonts \
font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=ast \
font--lang=av \
font--lang=ay \
font--lang=be \
font--lang=bg \
font--lang=bi \
font--lang=bin \
font--lang=br \
font--lang=bs \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cy \
font--lang=da \
font--lang=de \
font--lang=el \
font--lang=en \
font--lang=eo \
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
font--lang=ga \
font--lang=gd \
font--lang=gl \
font--lang=gn \
font--lang=gv \
font--lang=haw \
font--lang=ho \
font--lang=hr \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ig \
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ku-tr \
font--lang=kum \
font--lang=kw \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=lez \
font--lang=lg \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=mi \
font--lang=mk \
font--lang=mo \
font--lang=ms \
font--lang=mt \
font--lang=na \
font--lang=nb \
font--lang=nds \
font--lang=ng \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=nv \
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=se \
font--lang=sel \
font--lang=sg \
font--lang=sk \
font--lang=sl \
font--lang=sm \
font--lang=sma \
font--lang=smj \
font--lang=smn \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=sr \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=to \
font--lang=tr \
font--lang=ts \
font--lang=ty \
font--lang=uz \
font--lang=ve \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=yo \
font--lang=za \
font--lang=zu \
font-crimson \
texlive-crimson-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
