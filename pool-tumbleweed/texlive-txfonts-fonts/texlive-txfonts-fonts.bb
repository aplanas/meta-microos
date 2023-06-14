SUMMARY = "Severed fonts for texlive-txfonts"
DESCRIPTION = "The  separated fonts package for texlive-txfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-txfonts-fonts-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "128fcfa38b15d541a959a1d7480ea823499d3e1839fc5c1ae8eaaaa2c212a4a62cfedbdb03cdbc385911f26bb0b0100d544aa6f7412bcb0e3b5af81499aa8a2b"
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
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-rtcxb \
font-rtcxbi \
font-rtcxbss \
font-rtcxi \
font-rtcxr \
font-rtcxss \
font-rtxb \
font-rtxbi \
font-rtxbmi \
font-rtxbsc \
font-rtxbss \
font-rtxbsssc \
font-rtxi \
font-rtxmi \
font-rtxr \
font-rtxsc \
font-rtxss \
font-rtxsssc \
font-t1xbtt \
font-t1xbttsc \
font-t1xtt \
font-t1xttsc \
font-tcxbtt \
font-tcxtt \
font-txbex \
font-txbexa \
font-txbmia \
font-txbsy \
font-txbsya \
font-txbsyb \
font-txbsyc \
font-txbtt \
font-txbttsc \
font-txex \
font-txexa \
font-txmia \
font-txsy \
font-txsya \
font-txsyb \
font-txsyc \
font-txtt \
font-txttsc \
texlive-txfonts-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
