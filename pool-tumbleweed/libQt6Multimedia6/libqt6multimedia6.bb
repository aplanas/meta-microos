SUMMARY = "Qt 6 Multimedia library"
DESCRIPTION = "The Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Multimedia6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2ae31875e700fcf59db3c8607d180977446f3766f97fc5d53be746d2b121569b564c89f752cb87d818777479d8ccdcb9895439af8e152069751ee39fdff15598"

RPROVIDES:${PN} += "libQt6Multimedia.so.6 \
libQt6Multimedia6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
