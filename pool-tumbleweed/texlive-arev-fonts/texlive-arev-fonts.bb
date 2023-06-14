SUMMARY = "Severed fonts for texlive-arev"
DESCRIPTION = "The  separated fonts package for texlive-arev"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-arev-fonts-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "543cba449b5fec86ce8a9459f27ad0004a8a0523c5e2f7ec9748fbccf5be23762dc910757b61b012a934416333aeac13394ffd29872e6044e42726faff3d513b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=da \
font--lang=de \
font--lang=el \
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
font--lang=lg \
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
font--lang=qu \
font--lang=quz \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
font--lang=shs \
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
font--lang=uz \
font--lang=vo \
font--lang=wa \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-arevsans \
texlive-arev-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
