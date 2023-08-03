SUMMARY = "Severed fonts for texlive-bangla"
DESCRIPTION = "The  separated fonts package for texlive-bangla"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn65786"

RPM_NAME = "texlive-bangla-fonts-2023.209.2.1svn65786-54.1.noarch.rpm"
RPM_HASH = "94bad64eaca35d7a585919b964dc32b20065d70e6b0894daa386e952abdfadc2fac9804dc0b702c227cf771314f8494ae16ba6c8227c3921ce6e92fc2d07ed3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=as \
font--lang=bn \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=mni \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-kalpurush \
font-shimanto \
texlive-bangla-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
