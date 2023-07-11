SUMMARY = "UPnP Media Renderer front-end to MPD, the Music Player Daemon"
DESCRIPTION = "Upmpdcli turns MPD, the Music Player Daemon into an UPnP Media Renderer, \
usable with most UPnP Control Point applications, such as those which run \
on Android tablets or phones."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.7"

RPM_NAME = "upmpdcli-1.7.7-1.2.aarch64.rpm"
RPM_HASH = "b29c711636d2ae88c6f739af3fb1c30dc28e3011ada312752f76f101e543f52dec9df7e1e248d773dfa7991a927c8263258af4fa07ed87898462de49fe8ddaeb"

RPROVIDES:${PN} += "config-upmpdcli \
upmpdcli"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
group-audio \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libm.so.6 \
libmicrohttpd.so.12 \
libmpdclient.so.2 \
libstdc++.so.6 \
libupnpp.so.12 \
shadow"

inherit rpm
