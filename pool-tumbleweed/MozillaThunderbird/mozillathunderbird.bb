SUMMARY = "An integrated email, news feeds, chat, and newsgroups client"
DESCRIPTION = "Thunderbird is a free, open-source, cross-platform application for \
managing email, news feeds, chat, and news groups. It is a local \
(rather than browser- or web-based) email application that is powerful \
yet easy to use."
LICENSE = "MPL-2.0"

PV = "102.13.1"

RPM_NAME = "MozillaThunderbird-102.13.1-1.1.aarch64.rpm"
RPM_HASH = "545a772c36c06802aed2d23f6903826b181b1b49be47deaa9a6cab2b1a64b32209ad4be484cde8940005f359f1d3968eeb42527b3b7e6ecc2a76227e64e52ba2"

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
