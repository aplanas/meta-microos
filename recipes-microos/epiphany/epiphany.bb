SUMMARY = "GNOME Web Browser"
DESCRIPTION = "Epiphany is a Web browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance."
LICENSE = "GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "epiphany-44.2-1.1.aarch64.rpm"
RPM_HASH = "ece3f04e66666ace79623626c852b45938bb39fd4ca8dfdd2515b848e4730375afbed5df914bafe93af219fedfe2bbd80b73d5dc9a8e6efba82f7441f34c053b"

RPROVIDES:${PN} += "application() application(org.gnome.Epiphany.desktop) epiphany epiphany(aarch-64) libephymain.so()(64bit) libephymisc.so()(64bit) libephysync.so()(64bit) libephywebextension.so()(64bit) libephywebprocessextension.so()(64bit) metainfo() metainfo(org.gnome.Epiphany.appdata.xml) mimehandler(application/x-mimearchive) mimehandler(application/x-xpinstall) mimehandler(application/xhtml+xml) mimehandler(message/rfc822) mimehandler(multipart/related) mimehandler(text/html) mimehandler(x-scheme-handler/http) mimehandler(x-scheme-handler/https)"
RDEPENDS:${PN} += "epiphany-branding iso-codes ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcr-4.so.4()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmp.so.10()(64bit) libgobject-2.0.so.0()(64bit) libgraphene-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-4.so.1()(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libjavascriptcoregtk-6.0.so.1()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libpango-1.0.so.0()(64bit) libportal-gtk4.so.1()(64bit) libportal.so.1()(64bit) libsecret-1.so.0()(64bit) libsoup-3.0.so.0()(64bit) libsqlite3.so.0()(64bit) libwebkitgtk-6.0.so.4()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit)"

inherit rpm
