SUMMARY = "Severed fonts for texlive-ektype-tanka"
DESCRIPTION = "The  separated fonts package for texlive-ektype-tanka"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-fonts-2023.201.0.0.2svn63255-53.1.noarch.rpm"
RPM_HASH = "37e07b08fb11ac405b1ee9c4b1d09d41e812b0220d071b614d80c5bb2136a884ec0b86df829ca75c8746703f791fef1fcabb1426586a5d4774c4b6647309b15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=ast \
font--lang=ay \
font--lang=az-az \
font--lang=bh \
font--lang=bho \
font--lang=bi \
font--lang=bin \
font--lang=br \
font--lang=brx \
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
font--lang=doi \
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
font--lang=hi \
font--lang=hne \
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
font--lang=kok \
font--lang=ku-tr \
font--lang=kw \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mai \
font--lang=mg \
font--lang=mh \
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
font--lang=sa \
font--lang=sat \
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
font-baloo2 \
font-baloo2extrabold \
font-baloo2medium \
font-baloo2semibold \
font-gotu \
font-jaini \
font-jainipurva \
font-modak \
font-mukta \
font-muktaextrabold \
font-muktaextralight \
font-muktalight \
font-muktamedium \
font-muktasemibold \
texlive-ektype-tanka-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
