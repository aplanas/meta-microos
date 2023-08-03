SUMMARY = "Severed fonts for texlive-ocr-b-outline"
DESCRIPTION = "The  separated fonts package for texlive-ocr-b-outline"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20969"

RPM_NAME = "texlive-ocr-b-outline-fonts-2023.209.svn20969-55.1.noarch.rpm"
RPM_HASH = "787af06299d4d9f1beb49f4452ea1f05e4ea84d1591aa9b409a27f6fa3b2f1cadfaa9972f399063d22e6f1b42e547fb67e30fd9a1d2d40cd27bc9f713d8a409b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-ocr-b-outline-fonts \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
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
font-ocrb10 \
font-ocrb5 \
font-ocrb6 \
font-ocrb7 \
font-ocrb8 \
font-ocrb9 \
texlive-ocr-b-outline-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
