SUMMARY = "A SIP Soft Phone"
DESCRIPTION = "Twinkle is a SIP-based soft phone for making telephone calls over IP \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "twinkle-1.10.3-2.2.aarch64.rpm"
RPM_HASH = "e4663619544413db4a5fb475a5730514e624b47aa2d948df3cd3d865cad7424f0ffe21bb1ccce559c70f29736ae8f0704c6bdc5d5462283533280da10543b894"

RPROVIDES:${PN} += "twinkle"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libbcg729.so.0 \
libc.so.6 \
libccrtp.so.3 \
libcommoncpp.so.8 \
libgcc-s.so.1 \
libgsm.so.1 \
libilbc.so.0 \
libm.so.6 \
libmagic.so.1 \
libreadline.so.8 \
libresolv.so.2 \
libsndfile.so.1 \
libspeex.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libucommon.so.8 \
libusecure.so.8 \
libxml2.so.2 \
libzrtpcpp.so.4 \
update-desktop-files"

inherit rpm
