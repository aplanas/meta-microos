SUMMARY = "Remote desktop protocol (RDP) server"
DESCRIPTION = "A terminal server, capable of accepting connection from rdesktop and \
Microsoft's own terminal server / remote desktop clients."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "xrdp-0.9.20-8.1.aarch64.rpm"
RPM_HASH = "9c0a9e9ec3711c2a0cc93e4134c019e8a9d0fd59ba89f7a37f7079c09ce13cbc66b95c6cbd841c4122bcf244638dbed603852c7fa206a7074536b639f8ee4ae6"

RPROVIDES:${PN} += "config-xrdp \
libcommon.so.0 \
libmc.so \
libscp.so.0 \
libvnc.so \
libxrdp.so.0 \
libxrdpapi.so.0 \
libxup.so \
xrdp"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libpam.so.0 \
libssl.so.3 \
xorg-x11-Xvnc"

inherit rpm
