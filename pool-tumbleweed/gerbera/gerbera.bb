SUMMARY = "UPnP Media Server"
DESCRIPTION = "Gerbera is a UPnP media server which allows streaming digital \
media through a network and consume it on a variety of UPnP \
compatible devices."
LICENSE = "GPL-2.0-only"

PV = "1.12.1"

RPM_NAME = "gerbera-1.12.1-2.3.aarch64.rpm"
RPM_HASH = "eac369ad22cd20ac114681475931370d517c3211a4110bf12915a51a860a00fcd1ea9f808611005d3c4f285ee9994a96c464904dc4a87cdf718c3c339b5287c8"

RPROVIDES:${PN} += "config-gerbera \
gerbera"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcurl.so.4 \
libduktape.so.207 \
libebml.so.5 \
libexiv2.so.28 \
libffmpegthumbnailer.so.4 \
libfmt.so.9 \
libgcc-s.so.1 \
libixml.so.11 \
libmagic.so.1 \
libmatroska.so.7 \
libpugixml.so.1 \
libspdlog.so.1.12 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtag.so.1 \
libupnp.so.17 \
libuuid.so.1 \
logrotate \
systemd"

inherit rpm
