SUMMARY = "Library implementing a VNC server"
DESCRIPTION = "LibVNCServer/LibVNCClient are cross-platform C libraries that allow \
implementing VNC server or client functionality in your program."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.13"

RPM_NAME = "libvncserver1-0.9.13-4.4.aarch64.rpm"
RPM_HASH = "96f8ba4f46bcfee367f593cf0db1574e9c5ea1b34eeb83d5e3400292193efe702facde82cbdc687c45ed39ea3efad82f624d14cb296f5c4c36924f4b289dac91"

RPROVIDES:${PN} += "libvncserver.so.1 \
libvncserver1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libjpeg.so.8 \
liblzo2.so.2 \
libpng16.so.16 \
libz.so.1"

inherit rpm
