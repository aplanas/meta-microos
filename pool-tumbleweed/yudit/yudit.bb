SUMMARY = "Unicode text editor"
DESCRIPTION = "yudit is a unicode package to edit and convert text of different \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.7"

RPM_NAME = "yudit-3.0.7-1.13.aarch64.rpm"
RPM_HASH = "adc978787848b68b8d3deb2f82044e6c5831367aec82a6fee2bac3a775f2ae4f849c5a89f4f23a8d98b2607a5485f4bce1b3484c2aad3c886d171c4fcf4672f7"

RPROVIDES:${PN} += "config-yudit \
yudit"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl"

inherit rpm
