SUMMARY = "Severed fonts for texlive-haranoaji-extra"
DESCRIPTION = "The  separated fonts package for texlive-haranoaji-extra"
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-fonts-2023.209.20230223svn66115-54.1.noarch.rpm"
RPM_HASH = "4c9727fcc6b825596b6be1471bf1ec6edc2670cbece56ca6d3acbf6c2067d0eea08e20580a4cad5063b422ceb6b73b77d3f98472720c61d9d0d06cb1628b3128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bg \
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
font--lang=haw \
font--lang=ho \
font--lang=ht \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=ja \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kum \
font--lang=kwm \
font--lang=lb \
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
font--lang=oc \
font--lang=om \
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=sel \
font--lang=sg \
font--lang=sm \
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
font--lang=to \
font--lang=ts \
font--lang=ty \
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-haranoajigothic \
font-haranoajigothicextralight \
font-haranoajigothiclight \
font-haranoajigothicnormal \
font-haranoajimincho \
font-haranoajiminchoextralight \
font-haranoajiminchoheavy \
font-haranoajiminchomedium \
font-haranoajiminchosemibold \
font-原ノ味明朝 \
font-原ノ味明朝extralight \
font-原ノ味明朝heavy \
font-原ノ味明朝medium \
font-原ノ味明朝semibold \
font-原ノ味角ゴシック \
font-原ノ味角ゴシックextralight \
font-原ノ味角ゴシックlight \
font-原ノ味角ゴシックnormal \
texlive-haranoaji-extra-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
