SUMMARY = "Server for Collaborative Document Edition"
DESCRIPTION = "Infinoted is a server for collaborative edition of documents via the \
Infinote protocol. It is typically used with Gobby as a client."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "infinoted-0.7.2-4.7.aarch64.rpm"
RPM_HASH = "67b3e4b79bb515b3c4f0a84af14290d69fa5bf6186173ff958b1fdf6e26b244e5580a8c52f16c120fb02710e8b1a2d2da3ee9d13557db1f10a7a6c8be562c05e"

RPROVIDES:${PN} += "config-infinoted \
infinoted \
libinfinoted-plugin-autosave.so \
libinfinoted-plugin-certificate-auth.so \
libinfinoted-plugin-dbus.so \
libinfinoted-plugin-directory-sync.so \
libinfinoted-plugin-document-stream.so \
libinfinoted-plugin-linekeeper.so \
libinfinoted-plugin-logging.so \
libinfinoted-plugin-note-chat.so \
libinfinoted-plugin-note-text.so \
libinfinoted-plugin-record.so \
libinfinoted-plugin-traffic-logging.so \
libinfinoted-plugin-transformation-protection.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaemon.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libinfinity-0.7.so.0 \
libinfinoted-plugin-manager-0.7.so.0 \
libinftext-0.7.so.0 \
libpam.so.0 \
libxml2.so.2"

inherit rpm
