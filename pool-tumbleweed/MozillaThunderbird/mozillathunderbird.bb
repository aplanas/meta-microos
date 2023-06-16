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
MozillaThunderbird-devel \
appdata- \
appdata-thunderbird.appdata.xml \
mozilla-kde4-version \
thunderbird"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
desktop-file-utils \
fileutils \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libasound.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfreetype6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpango-1.0.so.0 \
libplc4.so \
libplds4.so \
libsmime3.so \
libssl3.so \
libstdc++.so.6 \
libxcb-shm.so.0 \
libxcb.so.1 \
libz.so.1 \
mozilla-nspr \
mozilla-nss \
textutils"

inherit rpm
