SUMMARY = "Severed fonts for texlive-step"
DESCRIPTION = "The  separated fonts package for texlive-step"
LICENSE = "OFL-1.1"

PV = "2023.209.2.0.5svn57307"

RPM_NAME = "texlive-step-fonts-2023.209.2.0.5svn57307-58.1.noarch.rpm"
RPM_HASH = "6defd527e49eb5fcadb532a9e6d4753d7eb860187230e72cc53b293d0cdea22f36df92a643266275be2450422d019f032bc0e8aeaf788701b8ecca622ac9ef71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-step-fonts \
font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=av \
font--lang=ay \
font--lang=ba \
font--lang=be \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=bua \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cy \
font--lang=da \
font--lang=de \
font--lang=el \
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
font--lang=haw \
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
font--lang=ki \
font--lang=kj \
font--lang=kk \
font--lang=kl \
font--lang=ku-tr \
font--lang=kum \
font--lang=kwm \
font--lang=ky \
font--lang=la \
font--lang=lb \
font--lang=lez \
font--lang=lg \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=mk \
font--lang=mn-mn \
font--lang=mo \
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
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=qu \
font--lang=quz \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=se \
font--lang=sel \
font--lang=sg \
font--lang=sh \
font--lang=shs \
font--lang=sk \
font--lang=sl \
font--lang=sm \
font--lang=sma \
font--lang=smj \
font--lang=smn \
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
font--lang=to \
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
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-step \
texlive-step-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
