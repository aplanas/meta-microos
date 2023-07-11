SUMMARY = "Fonts for displaying math"
DESCRIPTION = "A collection of Math symbol fonts for LyX."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.7"

RPM_NAME = "lyx-fonts-2.3.7-1.4.noarch.rpm"
RPM_HASH = "a20a427a5ee718dfe2a68e1e57a3557a949b97205af808cce5a7af74ffb62296f7503f64fc542e7f1bb8cb3688a848be2f4a2f4d1b2c12ad26c707f2e287512b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=da \
font--lang=de \
font--lang=en \
font--lang=es \
font--lang=eu \
font--lang=fil \
font--lang=fj \
font--lang=fo \
font--lang=fur \
font--lang=fy \
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=kwm \
font--lang=lb \
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
font--lang=tl \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-cmex10 \
font-cmmi10 \
font-cmr10 \
font-cmsy10 \
font-dsrom10 \
font-esint10 \
font-eufm10 \
font-msam10 \
font-msbm10 \
font-rsfs10 \
font-stmary10 \
font-wasy10 \
lyx-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
