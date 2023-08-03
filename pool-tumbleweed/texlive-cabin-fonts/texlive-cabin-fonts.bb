SUMMARY = "Severed fonts for texlive-cabin"
DESCRIPTION = "The  separated fonts package for texlive-cabin"
LICENSE = "OFL-1.1"

PV = "2023.209.svn65358"

RPM_NAME = "texlive-cabin-fonts-2023.209.svn65358-53.1.noarch.rpm"
RPM_HASH = "22c3e3bb778929f825ef016e7868e4b3ae52b8adfd37f5b0bb8c988da787d5344c889663a1d28493e6870cb1d968a2952853463bc70e03445d43761963e09e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-cabin-fonts \
font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=ast \
font--lang=ay \
font--lang=az-az \
font--lang=bi \
font--lang=bin \
font--lang=br \
font--lang=bs \
font--lang=ca \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cy \
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
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ku-tr \
font--lang=kw \
font--lang=kwm \
font--lang=la \
font--lang=lb \
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
font--lang=nv \
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=qu \
font--lang=quz \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=rw \
font--lang=sc \
font--lang=se \
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
font--lang=vi \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-cabin \
font-cabinbold \
font-cabincondensed \
font-cabincondensed-boldcondensed \
font-cabincondensed-bolditaliccondensed \
font-cabincondensed-italiccondensed \
font-cabincondensed-mediumcondensed \
font-cabincondensed-mediumitaliccondensed \
font-cabincondensed-regularcondensed \
font-cabincondensed-semiboldcondensed \
font-cabincondensed-semibolditaliccondensed \
font-cabincondensedcondensed \
font-cabincondensedmediumcond \
font-cabincondensedsemiboldcond \
font-cabinmedium \
font-cabinsemibold \
texlive-cabin-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
