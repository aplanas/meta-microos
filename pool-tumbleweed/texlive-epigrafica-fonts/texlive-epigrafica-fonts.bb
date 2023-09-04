SUMMARY = "Severed fonts for texlive-epigrafica"
DESCRIPTION = "The  separated fonts package for texlive-epigrafica"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.01svn17210"

RPM_NAME = "texlive-epigrafica-fonts-2023.209.1.01svn17210-54.2.noarch.rpm"
RPM_HASH = "641888815e5659ef43c45d662c84ca410123c3462d75a379d243bbfacc317dc7e59fc8944d985f1ab3b26891302c3d87f48b1627203dc0c35b2b38bc7b518898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ast \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ca \
font--lang=ch \
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
font--lang=fur \
font--lang=fy \
font--lang=ga \
font--lang=gd \
font--lang=gl \
font--lang=gn \
font--lang=gv \
font--lang=ho \
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
font--lang=ku-tr \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
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
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ro \
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
font--lang=ve \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-epigrafica \
texlive-epigrafica-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
