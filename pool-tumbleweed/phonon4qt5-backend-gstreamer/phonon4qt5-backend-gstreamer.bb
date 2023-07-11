SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.10.0"

RPM_NAME = "phonon4qt5-backend-gstreamer-4.10.0-1.21.aarch64.rpm"
RPM_HASH = "6d4ed5bd4a5ab852039ba143f0b33b683600623142f81c43f9dc88c8c815a809a564d738469d6574a40579ac02b25f8c12a53666bc62f1928396108dcb0c37a2"

RPROVIDES:${PN} += "phonon4qt5-backend \
phonon4qt5-backend-gstreamer \
phonon4qt5-backend-gstreamer-0-10"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libphonon4qt5 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
