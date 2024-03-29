SUMMARY = "Font for learning Japanese Kanji"
DESCRIPTION = "This font provides an easy way to view stroke order diagrams for over 6350 \
kanji, 183 kana symbols, the Latin characters and quite a few other symbols. \
I have also used it as a dumping ground for my own character creation doodles. \
 \
My hope is that this font will assist people who are learning kanji. I \
also hope it will help teachers of Japanese in the preparation of \
classroom material. Beware that Japanese stroke order can differ from the \
stroke order used in other languages that use Chinese characters."
LICENSE = "BSD-3-Clause"

PV = "23.08.0"

RPM_NAME = "fonts-KanjiStrokeOrders-23.08.0-1.1.noarch.rpm"
RPM_HASH = "75f87b528bac682f44ed5e0e9bbddd842614ac7028c7baa810dc7ce3612e432f80c7138cc2b71ab890c68d8055a167bd0db72213453a8a9a5b2d4a9fa6079d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=az-az \
font--lang=be \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=da \
font--lang=de \
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
font--lang=haw \
font--lang=ho \
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
font--lang=li \
font--lang=lt \
font--lang=mg \
font--lang=mh \
font--lang=mo \
font--lang=ms \
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
font--lang=ro \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=sel \
font--lang=sg \
font--lang=sk \
font--lang=sm \
font--lang=sma \
font--lang=smj \
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
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-kanjistrokeorders \
fonts-KanjiStrokeOrders \
kdeedu4-%{-kde4-datadir}/fonts/kanjistrokeorders/KanjiStrokeOrders.ttf"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
