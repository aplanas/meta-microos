SUMMARY = "WYSIWYM (What You See Is What You Mean) document processor"
DESCRIPTION = "LyX is a document processor that encourages an approach to writing \
based on the structure of your documents, not their appearance. The \
author can concentrate on the content (What You See Is What You Mean). \
The formatting is done by the backends (like LaTeX) and the output can \
have different formats, such as DVI, postscript, PDF, html. \
 \
LyX can check the LaTeX installation by opening the LaTeX Configuration \
document under 'Help' on the menubar. \
 \
LyX uses ImageMagick to deal with images. For security reasons \
(open)SUSE limits the functionaly of ImageMagick. See README.SUSE \
(in /usr/share/doc/packages/lyx/) for more information."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.7"

RPM_NAME = "lyx-2.3.7-1.4.aarch64.rpm"
RPM_HASH = "c9a6bad0cb58bc6aa72c1d2420e2f3151a25bfe08624aaec3df7d74194a12f674d5f0a05a59ed2127ebf1ae2bc022c75de225f5bf11da4d5708408957e1d281c"

RPROVIDES:${PN} += "lyx"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
ImageMagick \
aaa-base \
coreutils \
ghostscript \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libmagic.so.1 \
libmythes-1.2.so.0 \
libstdc++.so.6 \
libz.so.1 \
lyx-fonts \
perl"

inherit rpm
