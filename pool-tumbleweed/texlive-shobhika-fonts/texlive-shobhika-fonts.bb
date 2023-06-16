SUMMARY = "Severed fonts for texlive-shobhika"
DESCRIPTION = "The  separated fonts package for texlive-shobhika"
LICENSE = "OFL-1.1"

PV = "2023.201.1.05svn50555"

RPM_NAME = "texlive-shobhika-fonts-2023.201.1.05svn50555-53.1.noarch.rpm"
RPM_HASH = "69ad20391a66785d5c84525be4bb42d9e5b015193ad99f617d51983110e1aa4509b9c3997f89b153e981dd082d4dc7e4867b6b75e1145a9b23b7dd5e513a7edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=ab \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=ba \
font--lang=be \
font--lang=bg \
font--lang=bh \
font--lang=bho \
font--lang=bi \
font--lang=br \
font--lang=brx \
font--lang=bs \
font--lang=bua \
font--lang=ce \
font--lang=ch \
font--lang=chm \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cv \
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
font--lang=gv \
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
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=kaa \
font--lang=kj \
font--lang=kk \
font--lang=kok \
font--lang=ku-tr \
font--lang=kum \
font--lang=kv \
font--lang=kwm \
font--lang=ky \
font--lang=lb \
font--lang=lez \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mai \
font--lang=mg \
font--lang=mh \
font--lang=mn-mn \
font--lang=mr \
font--lang=ms \
font--lang=nb \
font--lang=nds \
font--lang=ne \
font--lang=ng \
font--lang=nl \
font--lang=nn \
font--lang=no \
font--lang=nr \
font--lang=nso \
font--lang=oc \
font--lang=om \
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sa \
font--lang=sah \
font--lang=sat \
font--lang=sc \
font--lang=sel \
font--lang=sg \
font--lang=sh \
font--lang=sk \
font--lang=sl \
font--lang=sma \
font--lang=smj \
font--lang=sn \
font--lang=so \
font--lang=sq \
font--lang=sr \
font--lang=ss \
font--lang=st \
font--lang=su \
font--lang=sv \
font--lang=sw \
font--lang=tg \
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=tt \
font--lang=ty \
font--lang=tyv \
font--lang=uk \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-shobhika \
font-shobhikabold \
font-shobhikaregular \
texlive-shobhika-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
