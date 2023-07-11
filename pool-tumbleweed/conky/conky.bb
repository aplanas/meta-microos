SUMMARY = "A System Monitor"
DESCRIPTION = "Conky is an configurable system monitor."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "conky-1.13.1-3.3.aarch64.rpm"
RPM_HASH = "0df23fe4286012390a74752af885d3926a1bfc9edfb7f750f7f615e05a65af1e9d06f80a594d7ce74334a2a3b199e766b1842cada27e2f9b3a7fd5c418e7cfc6"

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

RDEPENDS:${PN} += "/usr/bin/bash \
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
