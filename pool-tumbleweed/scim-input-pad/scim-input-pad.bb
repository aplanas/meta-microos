SUMMARY = "An onscreen input pad to easily input symbols"
DESCRIPTION = "An onscreen input pad to easily input symbols"
LICENSE = "GPL-2.0+"

PV = "0.1.3.20130804"

RPM_NAME = "scim-input-pad-0.1.3.20130804-6.31.aarch64.rpm"
RPM_HASH = "e760bba56f04cd7297c13a1d62f57dfe96bd0a991469fa041267f668b761d783749038dfc0282fc6d54e12214d27178da4542ba8bca607b90b148bad7cbfd9ee"

RPROVIDES:${PN} += "libscim-input-pad.so.0 \
scim-input-pad"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libstdc++.so.6"

inherit rpm
