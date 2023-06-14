SUMMARY = "Severed fonts for texlive-amiri"
DESCRIPTION = "The  separated fonts package for texlive-amiri"
LICENSE = "OFL-1.1"

PV = "2023.201.1.000svn65191"

RPM_NAME = "texlive-amiri-fonts-2023.201.1.000svn65191-54.1.noarch.rpm"
RPM_HASH = "44f4872074395fd8bec078bef1babf24c7922258edcaf02029dde1899dcf36768144f5bb1bee567e505b26a331e9344068fbfc9455b4b40f7e2d2f00b9d7ed27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=ar \
font--lang=ay \
font--lang=az-ir \
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
font--lang=eo \
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
font--lang=ga \
font--lang=gd \
font--lang=gl \
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
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ks \
font--lang=ku-iq \
font--lang=ku-ir \
font--lang=ku-tr \
font--lang=kwm \
font--lang=la \
font--lang=lah \
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
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=ota \
font--lang=pa-pk \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=ps-af \
font--lang=ps-pk \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sd \
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
font--lang=ug \
font--lang=ur \
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
font-amiri \
font-amiriquran \
font-amiriqurancolored \
texlive-amiri-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
