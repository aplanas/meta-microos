SUMMARY = "An email reader for the GNOME desktop"
DESCRIPTION = "Geary is a email reader for GNOME. \
 \
Its interface is based on conversations, so entire discussion \
may be read without having to navigate between messages."
LICENSE = "BSD-2-Clause & CC-BY-3.0 & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "geary-44.1-1.1.aarch64.rpm"
RPM_HASH = "a3a18fa3dd1b568ec835ac5d5a5572fc0002a2d520761f3c08a8bdcc5d69048624ca991cbb8ff7c3d8fa55a1a84c4accaa4e44d6fb8c15139e31736cb4c21447"

RPROVIDES:${PN} += "geary \
libdesktop-notifications.so \
libemail-templates.so \
libfolder-highlight.so \
libgeary-client-44.1.so \
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
