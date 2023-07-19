SUMMARY = "Plymouth 'space-flares' plugin"
DESCRIPTION = "This package contains the 'space-flares' boot splash plugin for \
Plymouth. It features a corner image with animated flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-space-flares-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "906684ab7cf6c3d5afdb2a11c78cd18d5eee364d19756e66fef44c968c50eb0e7e6aa3c40290053b6cdeedbd080675e4d6e4a18acb84c6fb9ed339e456f4a15b"

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
