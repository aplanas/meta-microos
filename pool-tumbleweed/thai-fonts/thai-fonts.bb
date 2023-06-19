SUMMARY = "A Collection of Thai OpenType Fonts"
DESCRIPTION = "Fonts-TLWG is a collection of Thai scalable fonts. It provides \
fonts that conform to existing standards and recommendations, so that it \
can be a reference implementation. \
 \
The fonts included are Garuda, Kinnari, Laksaman, Loma, Norasi, Purisa, \
Sawasdee, TlwgMono, TlwgTypewriter, TlwgTypo, Umpush and Waree."
LICENSE = "GPL-2.0-only-with-Font-exception-2.0 & LPPL-1.3c"

PV = "0.7.3"

RPM_NAME = "thai-fonts-0.7.3-1.7.noarch.rpm"
RPM_HASH = "9cd10931548a1754bf95de4a70458b967ea4bcfe0f119d6000bcd8ef6ec66855671ac0b6a265939fe763979b3b7398926818a785d533168854b0835c2ea085ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=bin \
font--lang=br \
font--lang=bs \
font--lang=ch \
font--lang=co \
font--lang=crh \
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
font--lang=gn \
font--lang=gv \
font--lang=ho \
font--lang=hr \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ig \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=mg \
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
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
font--lang=sl \
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
font--lang=th \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-garuda \
font-kinnari \
font-laksaman \
font-loma \
font-norasi \
font-purisa \
font-sawasdee \
font-tlwgmono \
font-tlwgtypewriter \
font-tlwgtypist \
font-tlwgtypo \
font-umpush \
font-waree \
fonts-thai \
locale-th \
thai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
