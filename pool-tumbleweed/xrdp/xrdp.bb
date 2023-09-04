SUMMARY = "Remote desktop protocol (RDP) server"
DESCRIPTION = "A terminal server, capable of accepting connection from rdesktop and \
Microsoft's own terminal server / remote desktop clients."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.22.1"

RPM_NAME = "xrdp-0.9.22.1-1.1.aarch64.rpm"
RPM_HASH = "401629cb5d7350e531de817868309277c289a7e1572a4fb66d1fa5dce59ab99bb547fd69ee718bb8f9bf8680bbb3114e6273d5b18e6af3a065b3a2f8f7876018"

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
