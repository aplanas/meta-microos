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

RPM_NAME = "lyx-2.3.7-1.3.aarch64.rpm"
RPM_HASH = "e02fdd7e0dcf2bf53c7ae8bacee5cd94485be10f3e8fcea6d18eac8e47b728e76bae926e83efe4a51a62cc21d3da02501ba578f6d351e23cd648cc54202ff20e"

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
