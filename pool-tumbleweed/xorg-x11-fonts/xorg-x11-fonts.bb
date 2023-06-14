SUMMARY = "X.Org fonts"
DESCRIPTION = "This package contains fonts maintained and shipped with X.Org."
LICENSE = "MIT"

PV = "7.6"

RPM_NAME = "xorg-x11-fonts-7.6-45.1.noarch.rpm"
RPM_HASH = "736e63d967965eb2f2bcf7018e87c5db38f699a2208178d4b385be3694e9b265cbe0a84488fc108769d9c156b2addbcae72cc53589268668216ff4252600a1ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=am \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=byn \
font--lang=ca \
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
font--lang=gez \
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
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ku-tr \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=mi \
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
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=rw \
font--lang=sc \
font--lang=se \
font--lang=sg \
font--lang=sid \
font--lang=sk \
font--lang=sl \
font--lang=sma \
font--lang=smj \
font--lang=smn \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=syr \
font--lang=ti-er \
font--lang=ti-et \
font--lang=tig \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wal \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-eastsyriacadiabene \
font-eastsyriacctesiphon \
font-estrangeloantioch \
font-estrangeloedessa \
font-estrangelomidyat \
font-estrangelonisibin \
font-estrangelonisibinoutline \
font-estrangeloquenneshrin \
font-estrangelotalada \
font-estrangeloturabdin \
font-goha-tibebzemen \
font-luximono \
font-luxisans \
font-luxiserif \
font-sertobatnan \
font-sertojerusalem \
font-sertojerusalemoutline \
font-sertokharput \
font-sertomalankara \
font-sertomardin \
font-sertourhoy \
xorg-x11-fonts \
xorg-x11-fonts-cyrillic \
xorg-x11-fonts-scalable \
xorg-x11-fonts-syriac"

RDEPENDS:${PN} += "/bin/sh \
fonts-config \
xorg-x11-fonts-core"

inherit rpm
