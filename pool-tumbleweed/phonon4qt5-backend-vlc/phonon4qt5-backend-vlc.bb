SUMMARY = "Phonon VLC Backend"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used. \
 \
This is the VLC backend for Phonon"
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.3"

RPM_NAME = "phonon4qt5-backend-vlc-0.11.3-1.15.aarch64.rpm"
RPM_HASH = "eb1add750bbb853f00440f95daee61cc3c7d50e40d4222cc2c38f3e188f0d850c49b9fc456d39671f4007df921879889916ae574c67a9421a8f0b6207d05f823"

RPROVIDES:${PN} += "phonon4qt5-backend \
phonon4qt5-backend-vlc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libvlc.so.5 \
libvlccore.so.9 \
vlc-noX"

inherit rpm
