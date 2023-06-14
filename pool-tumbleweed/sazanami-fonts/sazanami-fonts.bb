SUMMARY = "Japanese 'Sazanami' TrueType Fonts"
DESCRIPTION = "This package contains Japanese 'Sazanami' TrueType fonts."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "20040629"

RPM_NAME = "sazanami-fonts-20040629-212.26.noarch.rpm"
RPM_HASH = "d91bdad28d2df24fc9e6fb52b72fddb623ebad430859f0926258be0652357f15c6b61089c0bf70f683e3b34a6ed184128777473a98502e726217b760fce8ee1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=ab \
font--lang=af \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=ba \
font--lang=be \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=bua \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=chm \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cv \
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
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=hr \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=ja \
font--lang=jv \
font--lang=kaa \
font--lang=ki \
font--lang=kj \
font--lang=kk \
font--lang=kl \
font--lang=ku-tr \
font--lang=kum \
font--lang=kv \
font--lang=kwm \
font--lang=ky \
font--lang=la \
font--lang=lb \
font--lang=lez \
font--lang=lg \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=mn-mn \
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
font--lang=ru \
font--lang=rw \
font--lang=sah \
font--lang=sc \
font--lang=se \
font--lang=sel \
font--lang=sg \
font--lang=sh \
font--lang=sk \
font--lang=sl \
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
font--lang=tg \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=tt \
font--lang=tyv \
font--lang=uk \
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
font-sazanamigothic \
font-sazanamimincho \
font-さざなみゴシック \
font-さざなみ明朝 \
locale-ja \
sazanami-fonts \
scalable-font-ja"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
