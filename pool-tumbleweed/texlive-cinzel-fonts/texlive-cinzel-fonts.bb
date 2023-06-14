SUMMARY = "Severed fonts for texlive-cinzel"
DESCRIPTION = "The  separated fonts package for texlive-cinzel"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64550"

RPM_NAME = "texlive-cinzel-fonts-2023.201.svn64550-53.1.noarch.rpm"
RPM_HASH = "b85dca1449a95180f8d3154c2698326ebf75e0bf9d4a06cdb391fffb9c1465338e40cf846cac094e682c2ff46f2b6f88531509ffd6b551a5f79723f3ccc75007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-cinzel-fonts \
font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
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
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=lb \
font--lang=lg \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=ms \
font--lang=mt \
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
font-cinzel \
font-cinzelblack \
font-cinzeldecorative \
font-cinzeldecorativeblack \
texlive-cinzel-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
