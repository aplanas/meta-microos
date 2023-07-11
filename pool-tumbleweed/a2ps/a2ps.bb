SUMMARY = "Tool to convert ASCII/Latin Text into PostScript"
DESCRIPTION = "a2ps converts ASCII text into PostScript. This feature is used by \
apsfilter, for example, to pretty-print ASCII text. \
 \
Warning: a2ps is not able to convert complex Unicode (UTF-8) text to \
PostScript.  Only language text which can be converted from UTF-8 to \
Latin encodings are supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.15"

RPM_NAME = "a2ps-4.15-1.4.aarch64.rpm"
RPM_HASH = "ffdd649de24b709552f66d6cc0f90cb98b5999553593342be09879db74d779fe6c3322c367dcb0f8046a69dab4686fe988c273fbd93afbd3a1c13c98f8d83dfa"

RPROVIDES:${PN} += "a2ps \
a2ps-bin \
config-a2ps"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
file \
ghostscript-fonts-std \
glibc \
glibc-locale \
ld-linux-aarch64.so.1 \
liba2ps.so.1 \
libc.so.6 \
libgc.so.1 \
libm.so.6 \
libpaper.so.2 \
sed \
w3m \
wdiff"

inherit rpm
