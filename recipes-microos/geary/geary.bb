SUMMARY = "An email reader for the GNOME desktop"
DESCRIPTION = "Geary is a email reader for GNOME. \
 \
Its interface is based on conversations, so entire discussion \
may be read without having to navigate between messages."
LICENSE = "BSD-2-Clause & CC-BY-3.0 & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "geary-43.0-3.1.aarch64.rpm"
RPM_HASH = "2b4aaccd8817ec0fa8e6cc99c4f497af422173762e7b95d0b5126ed93072acfb62faa592918c9db0d6b8f63dc3f3ddaf3a5d1576d6584f11582fa93cd11a8660"

RPROVIDES:${PN} += "application() application(geary-autostart.desktop) application(org.gnome.Geary.desktop) geary geary(aarch-64) libdesktop-notifications.so()(64bit) libemail-templates.so()(64bit) libfolder-highlight.so()(64bit) libgeary-client-43.0.so()(64bit) libgeary-web-process.so()(64bit) libmail-merge.so()(64bit) libnotification-badge.so()(64bit) libsent-sound.so()(64bit) libspecial-folders.so()(64bit) metainfo() metainfo(org.gnome.Geary.appdata.xml) mimehandler(x-scheme-handler/mailto)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libenchant-2.so.2()(64bit) libfolks.so.26()(64bit) libgck-1.so.0()(64bit) libgcr-base-3.so.1()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmime-3.0.so.0()(64bit) libgoa-1.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsound.so.0()(64bit) libgspell-1.so.2()(64bit) libgtk-3.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libicuuc.so.72()(64bit) libjavascriptcoregtk-4.1.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpeas-1.0.so.0()(64bit) libsecret-1.so.0()(64bit) libsoup-3.0.so.0()(64bit) libsqlite3.so.0()(64bit) libstemmer.so.0d()(64bit) libunwind.so.8()(64bit) libwebkit2gtk-4.1.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
