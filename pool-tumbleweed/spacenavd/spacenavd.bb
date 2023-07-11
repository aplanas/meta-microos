SUMMARY = "Daemon for 3Dconnexion devices"
DESCRIPTION = "Spacenavd is a free software replacement user-space driver (daemon) \
for 3Dconnexion's 6-degree-of-freedoms input devices. It is \
compatible with the original 3dxsrv daemon, and works perfectly with \
any program that was written for the 3Dconnexion driver."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "spacenavd-1.2-1.3.aarch64.rpm"
RPM_HASH = "4861f60adbfc00fed8568bf2b8495a5d64ac63c172a240ab5b7127fdd1e26c614a71b5236b3ca1b2fead87e062e97b8378fab230fe95c06eda16e3cd86690dea"

RPROVIDES:${PN} += "config-spacenavd \
spacenavd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
systemd \
xdpyinfo"

inherit rpm
