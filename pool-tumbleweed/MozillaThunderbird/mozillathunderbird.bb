SUMMARY = "An integrated email, news feeds, chat, and newsgroups client"
DESCRIPTION = "Thunderbird is a free, open-source, cross-platform application for \
managing email, news feeds, chat, and news groups. It is a local \
(rather than browser- or web-based) email application that is powerful \
yet easy to use."
LICENSE = "MPL-2.0"

PV = "102.11.2"

RPM_NAME = "MozillaThunderbird-102.11.2-1.1.aarch64.rpm"
RPM_HASH = "d575526cf98a69257db88da34bf99c7d147bbf57e0617feabfce2a74fa3f609ec417efad1983bc85c7f3af91d9cbda4095725cb27862f9ff7a88ae32f6647db9"

RPROVIDES:${PN} += "MozillaThunderbird \
MozillaThunderbird(aarch-64) \
MozillaThunderbird-devel \
appdata() \
appdata(thunderbird.appdata.xml) \
application() \
application(thunderbird.desktop) \
metainfo() \
metainfo(thunderbird.appdata.xml) \
mimehandler(x-scheme-handler/mailto) \
mozilla-kde4-version \
thunderbird"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
desktop-file-utils \
fileutils \
ld-linux-aarch64.so.1()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libasound.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfreetype6 \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libpango-1.0.so.0()(64bit) \
libplc4.so()(64bit) \
libplds4.so()(64bit) \
libsmime3.so()(64bit) \
libssl3.so()(64bit) \
libstdc++.so.6()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit) \
mozilla-nspr \
mozilla-nss \
textutils"

inherit rpm
