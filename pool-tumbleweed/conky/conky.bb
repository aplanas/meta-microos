SUMMARY = "A System Monitor"
DESCRIPTION = "Conky is an configurable system monitor."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "conky-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "34fc88d4fbf28f1635c0cae2a468e0d583bedb7c887b1f63cea1a4943ce797b80e0bcf997e226d16e34341215742be818d923cc01b0e88945ecc59a74e6bc9f3"

RPROVIDES:${PN} += "config-conky \
conky \
conky-cairo \
conky-feature-nvidia \
conky-imlib2 \
libcairo-imlib2-helper.so \
libcairo.so \
libimlib2.so \
librsvg.so \
libtcp-portmon.so"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/lua5.1 \
fontawesome-fonts \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXNVCtrl.so.0 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libical.so.3 \
libircclient.so.1 \
libiw.so.30 \
liblua5.3.so.5 \
libm.so.6 \
libmariadb.so.3 \
libmicrohttpd.so.12 \
libncurses.so.6 \
libpulse.so.0 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.2"

inherit rpm
