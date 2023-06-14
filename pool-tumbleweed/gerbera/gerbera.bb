SUMMARY = "UPnP Media Server"
DESCRIPTION = "Gerbera is a UPnP media server which allows streaming digital \
media through a network and consume it on a variety of UPnP \
compatible devices."
LICENSE = "GPL-2.0-only"

PV = "1.12.1"

RPM_NAME = "gerbera-1.12.1-1.4.aarch64.rpm"
RPM_HASH = "3165f58d67d4c9ec69fde7e2014be406b22513d7a23afb92251fdf51e97c8fa2a5634af54e5ff35b53ab38d3068a709725b64f884d6fa980b430e156e94a6eaa"

RPROVIDES:${PN} += "config-gerbera \
gerbera"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libavcodec.so.59 \
libavformat.so.59 \
libavutil.so.57 \
libc.so.6 \
libcurl.so.4 \
libduktape.so.207 \
libebml.so.5 \
libexiv2.so.27 \
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
