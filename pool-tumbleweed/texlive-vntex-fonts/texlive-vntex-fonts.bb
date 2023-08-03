SUMMARY = "Severed fonts for texlive-vntex"
DESCRIPTION = "The  separated fonts package for texlive-vntex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.2svn62837"

RPM_NAME = "texlive-vntex-fonts-2023.209.3.2.2svn62837-54.1.noarch.rpm"
RPM_HASH = "94caa7e7e0d38d990066699cac3a44730a595b024c0416397b7bbd36a30a0918c05563b1ffc52ad3a07a39f30c54632602fa88a888cffb39a5aac63fd2ea7000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=bs \
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
font--lang=gn \
font--lang=gv \
font--lang=ho \
font--lang=hr \
font--lang=hsb \
font--lang=ht \
font--lang=hu \
font--lang=ia \
font--lang=id \
font--lang=ie \
font--lang=ig \
font--lang=io \
font--lang=is \
font--lang=it \
font--lang=jv \
font--lang=ki \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=lb \
font--lang=li \
font--lang=lt \
font--lang=lv \
font--lang=mg \
font--lang=mh \
font--lang=ms \
font--lang=na \
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
font--lang=ro \
font--lang=rw \
font--lang=sc \
font--lang=sg \
font--lang=sk \
font--lang=sl \
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
font-arevsans \
font-vietnamese\040computer\040modern \
font-vnbitstreamcharter \
font-vncccsc10 \
font-vnccr10 \
font-vnccsl10 \
font-vnccti10 \
font-vncenturyschoolbookl \
font-vncmbr10 \
font-vncmbr17 \
font-vncmbr8 \
font-vncmbr9 \
font-vncmbrbx10 \
font-vncmbrsl10 \
font-vncmbrsl17 \
font-vncmbrsl8 \
font-vncmbrsl9 \
font-vncmsltl10 \
font-vncmtl10 \
font-vnnimbusmonol \
font-vnnimbusromanno9l \
font-vnnimbussansl \
font-vnss17 \
font-vnssi17 \
font-vntexpalladiol \
font-vntopia \
font-vntxtt \
font-vntxttsc \
font-vnurwbookmanl \
font-vnurwchanceryl \
font-vnurwgothicl \
font-vnurwgroteskt \
font-vnurwpalladiol \
texlive-vntex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
