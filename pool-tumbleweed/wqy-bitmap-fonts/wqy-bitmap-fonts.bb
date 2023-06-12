SUMMARY = "Wen Quan Yi Bitmap Song CJK Fonts"
DESCRIPTION = "The Wen Quan Yi bitmap font includes complete CJK Unified \
Ideograph (U4E00 - U9FA5) glyphs at four different sizes \
(9pt-12X12 pixel, 10pt-13X13 pixel, 11pt-15X15 pixel, \
12pt-16x16 pixel) and two weights (medium and bold)."
LICENSE = "GPL-2.0-with-font-exception"

PV = "0.9.9_0"

RPM_NAME = "wqy-bitmap-fonts-0.9.9_0-16.15.noarch.rpm"
RPM_HASH = "615efa8f795585735b2bb2ab53a44a1452d61c44cd795b565e3ce230ca8a4a995bc3932e397b484982432e3fb0799499456c76a137ad8a2d670af2038a260464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(wqy-bitmap-fonts) \
font(:lang=bg) \
font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kum) \
font(:lang=kwm) \
font(:lang=ms) \
font(:lang=ng) \
font(:lang=nr) \
font(:lang=om) \
font(:lang=os) \
font(:lang=rn) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sel) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=sw) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=xh) \
font(:lang=za) \
font(:lang=zh-cn) \
font(:lang=zh-sg) \
font(:lang=zh-tw) \
font(:lang=zu) \
font(wenquanyiwenquanyibitmapsong) \
wqy-bitmap-fonts \
wqy-bitmapfont"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
perl"

inherit rpm
