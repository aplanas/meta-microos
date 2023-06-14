SUMMARY = "Remote desktop protocol (RDP) server"
DESCRIPTION = "A terminal server, capable of accepting connection from rdesktop and \
Microsoft's own terminal server / remote desktop clients."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "xrdp-0.9.20-7.3.aarch64.rpm"
RPM_HASH = "9df0ba6b1be311208391af1f82e3ce7a3b292e466043954fdee08a648fa9f2598f87b5669a8444c7eb6678ff7614eedaaa58d26717dd2e3f8aa857ac90b691b9"

RPROVIDES:${PN} += "config-xrdp \
libcommon.so.0 \
libmc.so \
libscp.so.0 \
libvnc.so \
libxrdp.so.0 \
libxrdpapi.so.0 \
libxup.so \
xrdp"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
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
