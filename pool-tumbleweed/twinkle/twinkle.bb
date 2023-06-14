SUMMARY = "A SIP Soft Phone"
DESCRIPTION = "Twinkle is a SIP-based soft phone for making telephone calls over IP \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "twinkle-1.10.3-2.1.aarch64.rpm"
RPM_HASH = "c4418a9f6b926f02eb094bfad63070b7b38e14f34d4ea266c916f1d16e7312af062541f1d56e76272e09d9edae0ce60afc547f812b22350eb44cac104573439c"

RPROVIDES:${PN} += "twinkle"

RDEPENDS:${PN} += "/bin/sh \
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
