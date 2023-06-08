SUMMARY = "Modern Jabber/XMPP Client using GTK+/Vala"
DESCRIPTION = "Dino is an instant messaging client for the Jabber/XMPP network, \
providing a unique and modern user experience based on the latest \
technology from the GNOME project. Dino is still in early \
development and has limited features, but already has basic support \
for XMPP's latest encryption features. Future versions will provide \
a plug-in API, so that developers can easily add new optional \
features."
LICENSE = "GPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "dino-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "4df4761e889f20cf472ad53be1a0061b2932304f65a001b971d5e1c5f0b65eb24662f47f77d37296711fe09430d674e5995996115b836fda854befb20c8b2c5e"

RPROVIDES:${PN} += "application() application(im.dino.Dino.desktop) dino dino(aarch-64) dino-plugin-http-upload dino-plugin-omemo dino-plugin-openpgp libcrypto-vala.so.0()(64bit) libcrypto-vala0 libdino.so.0()(64bit) libdino0 libqlite.so.0()(64bit) libqlite0 libxmpp-vala.so.0()(64bit) libxmpp-vala0 metainfo() metainfo(im.dino.Dino.appdata.xml) mimehandler(x-scheme-handler/xmpp)"
RDEPENDS:${PN} += "/bin/sh gstreamer1(element-gtksink)()(64bit) hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libgraphene-1.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstrtp-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libgtk-4.so.1()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnice.so.10()(64bit) libpango-1.0.so.0()(64bit) libqrencode.so.4()(64bit) libsignal-protocol-c.so.2()(64bit) libsoup-3.0.so.0()(64bit) libsqlite3.so.0()(64bit) libsrtp2.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwebrtc_audio_processing.so.1()(64bit)"

inherit rpm
