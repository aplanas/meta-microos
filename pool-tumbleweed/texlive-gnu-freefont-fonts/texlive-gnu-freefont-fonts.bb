SUMMARY = "Severed fonts for texlive-gnu-freefont"
DESCRIPTION = "The  separated fonts package for texlive-gnu-freefont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-gnu-freefont-fonts-2023.209.svn29349-54.1.noarch.rpm"
RPM_HASH = "019afcf3663548bcfabb5011e2d92eac5f158a53e53aeafde342c774f94c23e9187258ee570e914ec81a1d536a231a5de3c7a4bc178d6a0830a68209ff7caec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=ab \
font--lang=af \
font--lang=ak \
font--lang=am \
font--lang=an \
font--lang=ar \
font--lang=as \
font--lang=ast \
font--lang=av \
font--lang=ay \
font--lang=az-az \
font--lang=az-ir \
font--lang=ba \
font--lang=be \
font--lang=ber-dz \
font--lang=ber-ma \
font--lang=bg \
font--lang=bh \
font--lang=bho \
font--lang=bi \
font--lang=bin \
font--lang=bm \
font--lang=bn \
font--lang=br \
font--lang=brx \
font--lang=bs \
font--lang=bua \
font--lang=byn \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=chm \
font--lang=chr \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cu \
font--lang=cv \
font--lang=cy \
font--lang=da \
font--lang=de \
font--lang=doi \
font--lang=dv \
font--lang=ee \
font--lang=el \
font--lang=en \
font--lang=eo \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fa \
font--lang=fat \
font--lang=ff \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fr \
font--lang=fur \
font--lang=fy \
font--lang=ga \
font--lang=gd \
font--lang=gez \
font--lang=gl \
font--lang=gn \
font--lang=gu \
font--lang=gv \
font--lang=ha \
font--lang=haw \
font--lang=he \
font--lang=hi \
font--lang=hne \
font--lang=ho \
font--lang=hr \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=hy \
font--lang=hz \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ig \
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=iu \
font--lang=jv \
font--lang=ka \
font--lang=kaa \
font--lang=kab \
font--lang=ki \
font--lang=kj \
font--lang=kk \
font--lang=kl \
font--lang=kok \
font--lang=kr \
font--lang=ks \
font--lang=ku-am \
font--lang=ku-iq \
font--lang=ku-ir \
font--lang=ku-tr \
font--lang=kum \
font--lang=kv \
font--lang=kw \
font--lang=kwm \
font--lang=ky \
font--lang=la \
font--lang=lah \
font--lang=lb \
font--lang=lez \
font--lang=lg \
font--lang=li \
font--lang=ln \
font--lang=lt \
font--lang=lv \
font--lang=mai \
font--lang=mg \
font--lang=mh \
font--lang=mi \
font--lang=mk \
font--lang=ml \
font--lang=mn-mn \
font--lang=mni \
font--lang=mo \
font--lang=mr \
font--lang=ms \
font--lang=mt \
font--lang=na \
font--lang=nb \
font--lang=nds \
font--lang=ne \
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
font--lang=or \
font--lang=os \
font--lang=ota \
font--lang=pa \
font--lang=pa-pk \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=ps-af \
font--lang=ps-pk \
font--lang=pt \
font--lang=qu \
font--lang=quz \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=ru \
font--lang=rw \
font--lang=sa \
font--lang=sah \
font--lang=sat \
font--lang=sc \
font--lang=sco \
font--lang=sd \
font--lang=se \
font--lang=sel \
font--lang=sg \
font--lang=sh \
font--lang=shs \
font--lang=si \
font--lang=sid \
font--lang=sk \
font--lang=sl \
font--lang=sm \
font--lang=sma \
font--lang=smj \
font--lang=smn \
font--lang=sms \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=sr \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=syr \
font--lang=ta \
font--lang=tg \
font--lang=th \
font--lang=ti-er \
font--lang=ti-et \
font--lang=tig \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=to \
font--lang=tr \
font--lang=ts \
font--lang=tt \
font--lang=tw \
font--lang=ty \
font--lang=tyv \
font--lang=ug \
font--lang=uk \
font--lang=und-zmth \
font--lang=ur \
font--lang=uz \
font--lang=ve \
font--lang=vi \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wal \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=yi \
font--lang=yo \
font--lang=za \
font--lang=zu \
font-freemono \
font-freesans \
font-freeserif \
texlive-gnu-freefont-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
