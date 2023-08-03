SUMMARY = "Severed fonts for texlive-oldstandard"
DESCRIPTION = "The  separated fonts package for texlive-oldstandard"
LICENSE = "OFL-1.1"

PV = "2023.209.2.6svn64464"

RPM_NAME = "texlive-oldstandard-fonts-2023.209.2.6svn64464-55.1.noarch.rpm"
RPM_HASH = "9e02f817c69b16d00caaad427a95c11b1d0cb960fb787ca7f4dc490dd7e7ef55e6ea665ba983c8fdec8c89b6cf3ed1b33bec461e2088aaa75933dc3e4ca42f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-oldstandard-fonts \
font--lang=aa \
font--lang=af \
font--lang=an \
font--lang=ast \
font--lang=av \
font--lang=ay \
font--lang=az-az \
font--lang=be \
font--lang=bg \
font--lang=bi \
font--lang=br \
font--lang=bs \
font--lang=ca \
font--lang=ce \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=cu \
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
font--lang=hz \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ik \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=kl \
font--lang=ku-tr \
font--lang=kum \
font--lang=kw \
font--lang=kwm \
font--lang=la \
font--lang=lb \
font--lang=lez \
font--lang=lg \
font--lang=li \
font--lang=ln \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=mi \
font--lang=mk \
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
font--lang=nv \
font--lang=ny \
font--lang=oc \
font--lang=om \
font--lang=os \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pl \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=ro \
font--lang=ru \
font--lang=rw \
font--lang=sc \
font--lang=sco \
font--lang=se \
font--lang=sel \
font--lang=sg \
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
font--lang=tk \
font--lang=tl \
font--lang=tn \
font--lang=to \
font--lang=tr \
font--lang=ts \
font--lang=ty \
font--lang=uk \
font--lang=uz \
font--lang=ve \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wen \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-oldstandard \
texlive-oldstandard-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
