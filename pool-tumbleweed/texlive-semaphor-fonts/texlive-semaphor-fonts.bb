SUMMARY = "Severed fonts for texlive-semaphor"
DESCRIPTION = "The  separated fonts package for texlive-semaphor"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn18651"

RPM_NAME = "texlive-semaphor-fonts-2023.201.svn18651-53.1.noarch.rpm"
RPM_HASH = "b5f15719c749f8e2310aa02cc571517a054ef79efefa8bf6014d4e3dbebe5c64663003b390a57176f5dd4b65847d9c9eb34c7812d26f5b1a9c97ab89f7da45c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-semaphor-fonts \
font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=cs \
font--lang=csb \
font--lang=en \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fur \
font--lang=gd \
font--lang=gl \
font--lang=gv \
font--lang=ho \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=li \
font--lang=mg \
font--lang=ms \
font--lang=ng \
font--lang=nl \
font--lang=nr \
font--lang=nso \
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
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
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-semafor \
texlive-semaphor-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
