SUMMARY = "Severed fonts for texlive-haranoaji"
DESCRIPTION = "The  separated fonts package for texlive-haranoaji"
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-fonts-2023.209.20230223svn66115-54.2.noarch.rpm"
RPM_HASH = "b3aa09705021e4ba7bd6d402edba009a0b16fe6e791d8c4cf3ea5b4cd1465de94e1a90f9ab228fec6aec0cd953d6204e5baeee08ea1476c354d4c43481bfd010"
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
font-haranoajigothicheavy \
font-haranoajigothicmedium \
font-haranoajimincho \
font-haranoajimincholight \
font-原ノ味明朝 \
font-原ノ味明朝light \
font-原ノ味角ゴシック \
font-原ノ味角ゴシックheavy \
font-原ノ味角ゴシックmedium \
texlive-haranoaji-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
