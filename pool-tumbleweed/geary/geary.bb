SUMMARY = "An email reader for the GNOME desktop"
DESCRIPTION = "Geary is a email reader for GNOME. \
 \
Its interface is based on conversations, so entire discussion \
may be read without having to navigate between messages."
LICENSE = "BSD-2-Clause & CC-BY-3.0 & LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "geary-44.0-1.1.aarch64.rpm"
RPM_HASH = "e67751d195ce7a70f195712741078993ca5604f6bb948a9260d7e5dee7f58687a4f3aedef5d35522c1cbdb0e556fdd3b6783d49bbebca0e668aecea1074dc170"

RPROVIDES:${PN} += "geary \
libdesktop-notifications.so \
libemail-templates.so \
libfolder-highlight.so \
libgeary-client-44.0.so \
libgeary-web-process.so \
libmail-merge.so \
libnotification-badge.so \
libsent-sound.so \
libspecial-folders.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libfolks.so.26 \
libgck-1.so.0 \
libgcr-base-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libicuuc.so.73 \
libjavascriptcoregtk-4.1.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpeas-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libstemmer.so.0d \
libunwind.so.8 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
