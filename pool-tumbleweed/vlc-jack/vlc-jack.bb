SUMMARY = "Jack integration for the VLC media player"
DESCRIPTION = "This package adds jack support to vlc via plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-jack-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "496c2f2124ff60f62034344ebabfbcf25a98d81a8f3d5611b85bf271045929492d824de53fa2c45ea8e390932cc7e99ad869d098ba6f8438c6542fbf69e81707"

RPROVIDES:${PN} += "libaccess-jack-plugin.so \
libjack-plugin.so \
vlc-jack"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
libm.so.6 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
