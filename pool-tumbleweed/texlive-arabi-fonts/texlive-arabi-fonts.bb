SUMMARY = "Severed fonts for texlive-arabi"
DESCRIPTION = "The  separated fonts package for texlive-arabi"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44662"

RPM_NAME = "texlive-arabi-fonts-2023.209.1.1svn44662-55.1.noarch.rpm"
RPM_HASH = "c8338d1fca1b06354b453a8a4911ff62b4831bd553377de4a977d267a60185306c2b6887e301808dd5d907e6fb4b2607aea59a9048cddabbc5cbba46b34b8c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ar \
font--lang=ay \
font--lang=az-ir \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=da \
font--lang=de \
font--lang=en \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fa \
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
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ku-tr \
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
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-ae-albattar \
font-ae-almateen \
font-ae-almohanadbold \
font-ae-almohanadbolditalic \
font-ae-almohanadextrabold2 \
font-ae-almohanadthin \
font-ae-almothnna \
font-ae-alyermook \
font-ae-arab \
font-ae-cortoba \
font-ae-dimnah \
font-ae-furat \
font-ae-granada \
font-ae-graph \
font-ae-hani \
font-ae-hor \
font-ae-kayrawan \
font-ae-khalid \
font-ae-mashq \
font-ae-metal \
font-ae-nada \
font-ae-nagham \
font-ae-nice \
font-ae-ostorah \
font-ae-ouhod \
font-ae-petra \
font-ae-rehan \
font-ae-salem \
font-ae-shado \
font-ae-sharjah \
font-ae-sindibad \
font-ae-tarablus \
font-ae-tholoth \
font-homa \
font-nazli \
font-titr \
texlive-arabi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
