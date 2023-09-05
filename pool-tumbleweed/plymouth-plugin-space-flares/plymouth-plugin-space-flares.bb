SUMMARY = "Plymouth 'space-flares' plugin"
DESCRIPTION = "This package contains the 'space-flares' boot splash plugin for \
Plymouth. It features a corner image with animated flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-space-flares-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "8ac7603b41321542922c73779b7d2fd48a163fd999accecf0c9370c04d0ff4d80e7d2b51f7593d7fff82bdab2239867fa86708dc8b3a00327973d65865f0421b"

RPROVIDES:${PN} += "plymouth-plugin-space-flares"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply-splash-core5 \
libply-splash-graphics.so.5 \
libply-splash-graphics5 \
libply.so.5 \
libply5 \
plymouth-plugin-label"

inherit rpm
