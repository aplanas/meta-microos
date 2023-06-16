SUMMARY = "Severed fonts for texlive-mlmodern"
DESCRIPTION = "The  separated fonts package for texlive-mlmodern"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn57458"

RPM_NAME = "texlive-mlmodern-fonts-2023.201.1.2svn57458-54.1.noarch.rpm"
RPM_HASH = "4f9b7f7b74bc6f0c31623758bd540fb538863aad4dcb650f1fb0953e2c61f65bd441ea2b168ad1cc92ac9a61c96822cc5cc2669de22481d2b55b68427659bd75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ast \
font--lang=ay \
font--lang=bi \
font--lang=bin \
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
font--lang=la \
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
font-mlmmathextension10 \
font-mlmmathitalic10 \
font-mlmmathitalic12 \
font-mlmmathitalic5 \
font-mlmmathitalic6 \
font-mlmmathitalic7 \
font-mlmmathitalic8 \
font-mlmmathitalic9 \
font-mlmmathsymbols10 \
font-mlmmathsymbols5 \
font-mlmmathsymbols6 \
font-mlmmathsymbols7 \
font-mlmmathsymbols8 \
font-mlmmathsymbols9 \
font-mlmmono10 \
font-mlmmono12 \
font-mlmmono8 \
font-mlmmono9 \
font-mlmmonocaps10 \
font-mlmmonolt10 \
font-mlmmonoltcond10 \
font-mlmmonoprop10 \
font-mlmmonoproplt10 \
font-mlmmonoslant10 \
font-mlmroman10 \
font-mlmroman12 \
font-mlmroman17 \
font-mlmroman5 \
font-mlmroman6 \
font-mlmroman7 \
font-mlmroman8 \
font-mlmroman9 \
font-mlmromancaps10 \
font-mlmromandemi10 \
font-mlmromandunh10 \
font-mlmromanslant10 \
font-mlmromanslant12 \
font-mlmromanslant17 \
font-mlmromanslant8 \
font-mlmromanslant9 \
font-mlmromanunsl10 \
font-mlmsans10 \
font-mlmsans12 \
font-mlmsans17 \
font-mlmsans8 \
font-mlmsans9 \
font-mlmsansdemicond10 \
font-mlmsansquot8 \
texlive-mlmodern-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
