SUMMARY = "Severed fonts for texlive-baekmuk"
DESCRIPTION = "The  separated fonts package for texlive-baekmuk"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-fonts-2023.209.2.2.1svn56915-54.1.noarch.rpm"
RPM_HASH = "64a84b83ca87e035ca7346a17093fca5e0da124a19ab48dcae9a72e49d8f50e662d6ba81e474d20f241be672b4bd5d2f194029bf7b0276f866b64c5d60caa0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=ko \
font--lang=kum \
font--lang=kwm \
font--lang=lg \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=os \
font--lang=rn \
font--lang=ru \
font--lang=rw \
font--lang=sel \
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
font-baekmukbatang \
font-baekmukdotum \
font-baekmukgulim \
font-baekmukheadline \
font-백묵굴림 \
font-백묵돋움 \
font-백묵바탕 \
font-백묵헤드라인 \
texlive-baekmuk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
