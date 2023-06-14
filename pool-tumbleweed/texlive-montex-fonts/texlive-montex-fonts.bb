SUMMARY = "Severed fonts for texlive-montex"
DESCRIPTION = "The  separated fonts package for texlive-montex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.ivu.04.092svn29349"

RPM_NAME = "texlive-montex-fonts-2023.201.ivu.04.092svn29349-54.1.noarch.rpm"
RPM_HASH = "c1d31dc9ec9635c0e88f208ffdbf2e7752ef50a29b94ae6d9160decb563295e9189d4d70ded94118164269cc955b147798f83eb0e85191e8ac36bd1cc3f9220e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=da \
font--lang=de \
font--lang=en \
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
font--lang=gv \
font--lang=ho \
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
font--lang=kj \
font--lang=ku-tr \
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
font--lang=tr \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-tex\040bcghsb \
font-tex\040bcghsm \
font-tex\040bcghwb \
font-tex\040bcghwm \
font-tex\040bcgvsb \
font-tex\040bcgvsm \
font-tex\040bcgvwb \
font-tex\040bcgvwm \
font-tex\040bicighb \
font-tex\040bicighm \
font-tex\040bicigvb \
font-tex\040bicigvm \
font-tex\040bthhsb \
font-tex\040bthhsm \
font-tex\040bthhwb \
font-tex\040bthhwm \
font-tex\040bthvsb \
font-tex\040bthvsm \
font-tex\040bthvwb \
font-tex\040bthvwm \
font-tex\040bxghsb \
font-tex\040bxghsm \
font-tex\040bxghwb \
font-tex\040bxghwm \
font-tex\040bxgvsb \
font-tex\040bxgvsm \
font-tex\040bxgvwb \
font-tex\040bxgvwm \
font-tex\040kmbx10 \
font-tex\040kmr10 \
font-tex\040kmss10 \
texlive-montex-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
