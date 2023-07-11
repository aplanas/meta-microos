SUMMARY = "UPnP Media Server"
DESCRIPTION = "Gerbera is a UPnP media server which allows streaming digital \
media through a network and consume it on a variety of UPnP \
compatible devices."
LICENSE = "GPL-2.0-only"

PV = "1.12.1"

RPM_NAME = "gerbera-1.12.1-2.2.aarch64.rpm"
RPM_HASH = "17b330372bf9a031540d4c30aa5aba950da6b49d9a246471963af2b9517356da496a10cc43ba8ee66ad66be4a758b5c6520ed9aa3749cacd7aa932a48c8e908c"

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
libspdlog.so.1.11 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtag.so.1 \
libupnp.so.17 \
libuuid.so.1 \
logrotate \
systemd"

inherit rpm
