SUMMARY = "Notetaking software designed around a tablet"
DESCRIPTION = "Xournal++ is a hand note taking software. \
It supports pen input, e.g. Wacom tablets."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "xournalpp-1.1.3-2.1.aarch64.rpm"
RPM_HASH = "cd370077f1aade89cc7c71ffc29f7ae99dc42ddeba17d7d3b721cf2939f6d1461da716e26fd1649ec752b0fff48ed5d9e212115689bfa7d91ea62f23a960f8b6"

RPROVIDES:${PN} += "application() \
application(com.github.xournalpp.xournalpp.desktop) \
metainfo() \
metainfo(com.github.xournalpp.xournalpp.appdata.xml) \
mimehandler(application/pdf) \
mimehandler(application/x-xoj) \
mimehandler(application/x-xojpp) \
mimehandler(application/x-xopp) \
mimehandler(application/x-xopt) \
xournalpp \
xournalpp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpoppler-glib.so.8()(64bit) \
libportaudio.so.2()(64bit) \
libportaudiocpp.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzip.so.5()(64bit)"

inherit rpm
