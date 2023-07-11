SUMMARY = "Libquicktime Tools"
DESCRIPTION = "Tools for reading/writing quicktime movie files."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-tools-1.2.4+git20180804.fff99cd-4.2.aarch64.rpm"
RPM_HASH = "83856bf12cd622379c3b2874ae448e8f4facf463062a796c89e30b1675f7a554fd7174184370daa2f539ab010daf128f5ef0eeb354b648da846beffe7a375524"

RPROVIDES:${PN} += "libquicktime-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libXv.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libquicktime \
libquicktime.so.0 \
libquicktime0"

inherit rpm
