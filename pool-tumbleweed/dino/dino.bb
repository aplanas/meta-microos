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

RPM_NAME = "dino-0.4.2-1.3.aarch64.rpm"
RPM_HASH = "90b5794a519feaad9bec14486b7d274b3f41011acd86d7fe1e1f2143ad57e72ac6db579b55d043a7d95c363307452eea1ccde9db093fc7cb6ff989742461a95b"

RPROVIDES:${PN} += "dino \
dino-plugin-http-upload \
dino-plugin-omemo \
dino-plugin-openpgp \
libcrypto-vala.so.0 \
libcrypto-vala0 \
libdino.so.0 \
libdino0 \
libqlite.so.0 \
libqlite0 \
libxmpp-vala.so.0 \
libxmpp-vala0"

RDEPENDS:${PN} += "/usr/bin/sh \
gstreamer1 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgraphene-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libicuuc.so.73 \
libm.so.6 \
libnice.so.10 \
libpango-1.0.so.0 \
libqrencode.so.4 \
libsignal-protocol-c.so.2 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libsrtp2.so.1 \
libstdc++.so.6 \
libwebrtc-audio-processing.so.1"

inherit rpm
