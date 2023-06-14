SUMMARY = "Severed fonts for texlive-frcursive"
DESCRIPTION = "The  separated fonts package for texlive-frcursive"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24559"

RPM_NAME = "texlive-frcursive-fonts-2023.201.svn24559-52.1.noarch.rpm"
RPM_HASH = "6acf252df4d89813be82ff9b8a44cf4397be913a60544bb98bbb9f80d741ac157ad9d9b6e60346957d0216f3bd7126e2d851f0bfc4dc65591e707bedc0b73e6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=aa \
font--lang=an \
font--lang=ay \
font--lang=bi \
font--lang=br \
font--lang=ch \
font--lang=crh \
font--lang=cs \
font--lang=csb \
font--lang=en \
font--lang=es \
font--lang=et \
font--lang=eu \
font--lang=fi \
font--lang=fil \
font--lang=fj \
font--lang=fur \
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
font--lang=it \
font--lang=jv \
font--lang=kj \
font--lang=ku-tr \
font--lang=kwm \
font--lang=li \
font--lang=mg \
font--lang=ms \
font--lang=ng \
font--lang=nl \
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
font-frca10 \
font-frcbx10 \
font-frcbx14 \
font-frcbx6 \
font-frcc10 \
font-frcc14 \
font-frcc6 \
font-frcf10 \
font-frcf14 \
font-frcf6 \
font-frcr10 \
font-frcr14 \
font-frcr6 \
font-frcsl10 \
font-frcsl14 \
font-frcsl6 \
font-frcslbx10 \
font-frcslbx14 \
font-frcslbx6 \
font-frcslc10 \
font-frcslc14 \
font-frcslc6 \
font-frcw10 \
texlive-frcursive-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
