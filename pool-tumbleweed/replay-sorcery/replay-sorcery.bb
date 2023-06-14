SUMMARY = "Instant replay solution for Linux"
DESCRIPTION = "This program will constantly record the screen without using too much \
computer resources and, at the press of a key combination, will save \
the last 30 seconds."
LICENSE = "GPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "replay-sorcery-0.6.0-2.6.aarch64.rpm"
RPM_HASH = "a64860bd3d370e6a3e951a178a3fbd632c66dd9e34663d11f07a582a22484419ff027e969d861ba523b6807971cd4490c57130a2344f9e9b8373fa3c9d8f564d"

RPROVIDES:${PN} += "replay-sorcery"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libavcodec.so.58.134 \
libavdevice.so.58.13 \
libavfilter.so.7.110 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libdrm.so.2 \
libgcc-s.so.1 \
libpulse.so.0 \
permissions \
systemd"

inherit rpm
