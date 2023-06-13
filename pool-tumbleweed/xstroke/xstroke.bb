SUMMARY = "Fullscreen gesture recognition for X"
DESCRIPTION = "xstroke is a full-screen gesture recognition program for the X Window \
System. It captures gestures performed with a pointer device, (such as \
a mouse, a stylus, or a pen/tablet), recognizes the gestures and \
performs actions based on the gestures."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "xstroke-0.6-253.1.aarch64.rpm"
RPM_HASH = "b8db307102472f6caff0a7eeded36775e7b7d8d3a886ca4c289f38190e1ee9186eca8cfd7c4c407d0759f05eb4500bca204b0f46c28603fa64b4fab6cbc062c8"

RPROVIDES:${PN} += "application() \
application(xstroke.desktop) \
config(xstroke) \
xstroke \
xstroke(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libXpm.so.4()(64bit) \
libXrender.so.1()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
