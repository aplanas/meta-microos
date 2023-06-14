SUMMARY = "Daemon for 3Dconnexion devices"
DESCRIPTION = "Spacenavd is a free software replacement user-space driver (daemon) \
for 3Dconnexion's 6-degree-of-freedoms input devices. It is \
compatible with the original 3dxsrv daemon, and works perfectly with \
any program that was written for the 3Dconnexion driver."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "spacenavd-1.2-1.2.aarch64.rpm"
RPM_HASH = "d59d4f09bd7e35bbb401b6f53dd07a68ba0921f6bdd20e281225d23e1cf140c7e561c5532624d7b525223dedf9f132903dacaa561e6321223d2e37c3a6aabbde"

RPROVIDES:${PN} += "config-spacenavd \
spacenavd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
systemd \
xdpyinfo"

inherit rpm
