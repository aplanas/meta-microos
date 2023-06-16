SUMMARY = "The basic X terminal program"
DESCRIPTION = " \
This package contains the basic X.Org terminal program."
LICENSE = "MIT"

PV = "380"

RPM_NAME = "xterm-bin-380-1.1.aarch64.rpm"
RPM_HASH = "a5ceffa43e44017cbe8bc8894b85484cdc5d5b86a6a0db612a4636d63082aff16529b35220f94a6201f310ffd36f56b7b6413d71e9455602049155700be061cd"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=be \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
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
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ko \
font--lang=ku-tr \
font--lang=kum \
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
font--lang=sc \
font--lang=se \
font--lang=sel \
font--lang=sg \
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
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
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
font--lang=zh-cn \
font--lang=zh-sg \
font--lang=zu \
font-miscfixedwide \
xterm-bin"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXft.so.2 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libtinfo.so.6 \
libutempter.so.0 \
xterm-resize"

inherit rpm
