SUMMARY = "Server for Collaborative Document Edition"
DESCRIPTION = "Infinoted is a server for collaborative edition of documents via the \
Infinote protocol. It is typically used with Gobby as a client."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "infinoted-0.7.2-4.6.aarch64.rpm"
RPM_HASH = "95ab49a23da1abb5b98af0be8f966a826482d57973b5b66748a4f22b7870b746b5ac5913a985a7e22db50aad16611a5296cf448faa678f115198278beae3e2cd"

RPROVIDES:${PN} += "config(infinoted) \
infinoted \
infinoted(aarch-64) \
libinfinoted-plugin-autosave.so()(64bit) \
libinfinoted-plugin-certificate-auth.so()(64bit) \
libinfinoted-plugin-dbus.so()(64bit) \
libinfinoted-plugin-directory-sync.so()(64bit) \
libinfinoted-plugin-document-stream.so()(64bit) \
libinfinoted-plugin-linekeeper.so()(64bit) \
libinfinoted-plugin-logging.so()(64bit) \
libinfinoted-plugin-note-chat.so()(64bit) \
libinfinoted-plugin-note-text.so()(64bit) \
libinfinoted-plugin-record.so()(64bit) \
libinfinoted-plugin-traffic-logging.so()(64bit) \
libinfinoted-plugin-transformation-protection.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdaemon.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libinfinity-0.7.so.0()(64bit) \
libinfinoted-plugin-manager-0.7.so.0()(64bit) \
libinftext-0.7.so.0()(64bit) \
libpam.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
