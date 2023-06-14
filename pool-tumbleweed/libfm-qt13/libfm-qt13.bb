SUMMARY = "Library providing components to build desktop file managers"
DESCRIPTION = "libfm-qt is the Qt port of libfm, a library providing components to \
build desktop file managers."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt13-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "69391ea3778a011e97128091c88dfea5010f413b7e1d782b4c80cf9f6224dcac76157f816e52f63f81b63ed16bf76eb82f6ca59b8b2e432669fa6e1d07635406"

RPROVIDES:${PN} += "libfm-qt \
libfm-qt.so.13 \
libfm-qt13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libexif.so.12 \
libfm-qt-data \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmenu-cache.so.3 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
