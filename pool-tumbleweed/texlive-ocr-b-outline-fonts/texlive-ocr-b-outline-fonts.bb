SUMMARY = "Severed fonts for texlive-ocr-b-outline"
DESCRIPTION = "The  separated fonts package for texlive-ocr-b-outline"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20969"

RPM_NAME = "texlive-ocr-b-outline-fonts-2023.201.svn20969-54.1.noarch.rpm"
RPM_HASH = "f8fafd5ee6aea69ca86d988d8b8ab6b71d2c5b9a0d244b2747ff09cd5a8d8d327489d56340c015a91fe3a8e0efc73dd15e702811518ab4c6d5a9c360f7773ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-ocr-b-outline-fonts) \
font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kwm) \
font(:lang=ms) \
font(:lang=ng) \
font(:lang=nr) \
font(:lang=om) \
font(:lang=rn) \
font(:lang=rw) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=sw) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=xh) \
font(:lang=za) \
font(:lang=zu) \
font(ocrb10) \
font(ocrb5) \
font(ocrb6) \
font(ocrb7) \
font(ocrb8) \
font(ocrb9) \
texlive-ocr-b-outline-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
