SUMMARY = "UPnP Media Renderer front-end to MPD, the Music Player Daemon"
DESCRIPTION = "Upmpdcli turns MPD, the Music Player Daemon into an UPnP Media Renderer, \
usable with most UPnP Control Point applications, such as those which run \
on Android tablets or phones."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.7"

RPM_NAME = "upmpdcli-1.7.7-1.1.aarch64.rpm"
RPM_HASH = "68e8517330b267bf456340e3367b9d68f7e0a85ec7e5df2aaa91b5b21e57c9b5183721e7ac36cf3f015bdcc97e4946900893940497895d5713fd800169c8c98c"

RPROVIDES:${PN} += "config-upmpdcli \
upmpdcli"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
