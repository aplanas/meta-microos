SUMMARY = "Severed fonts for texlive-fonts-tlwg"
DESCRIPTION = "The  separated fonts package for texlive-fonts-tlwg"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7.3svn60817"

RPM_NAME = "texlive-fonts-tlwg-fonts-2023.209.0.0.7.3svn60817-53.1.noarch.rpm"
RPM_HASH = "bc0ed36c3abb6d2af05e8cf91d71da2f8c576ed5ac992b6f963e864d35ba8e3d2851984d902295f1021226c94e36dac2c28f1b96040d6ac75f616826e0ad475f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fonts-tlwg-fonts \
font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=bin \
font--lang=br \
font--lang=bs \
font--lang=ch \
font--lang=co \
font--lang=crh \
font--lang=da \
font--lang=de \
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
font--lang=gn \
font--lang=gv \
font--lang=ho \
font--lang=hr \
font--lang=ht \
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
font--lang=lg \
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
font--lang=nso \
font--lang=oc \
font--lang=om \
font--lang=pap-an \
font--lang=pap-aw \
font--lang=pt \
font--lang=rm \
font--lang=rn \
font--lang=rw \
font--lang=sc \
font--lang=sg \
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
font--lang=th \
font--lang=tl \
font--lang=tn \
font--lang=tr \
font--lang=ts \
font--lang=uz \
font--lang=vo \
font--lang=vot \
font--lang=wa \
font--lang=wo \
font--lang=xh \
font--lang=yap \
font--lang=za \
font--lang=zu \
font-garuda \
font-kinnari \
font-laksaman \
font-loma \
font-norasi \
font-purisa \
font-sawasdee \
font-tlwgmono \
font-tlwgtypewriter \
font-tlwgtypist \
font-tlwgtypo \
font-umpush \
font-waree \
texlive-fonts-tlwg-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
