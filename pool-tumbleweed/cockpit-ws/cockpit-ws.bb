SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later"

PV = "300.1"

RPM_NAME = "cockpit-ws-300.1-1.1.aarch64.rpm"
RPM_HASH = "c4253a65842038d155dfa499a2157da2a1c58c8d3038ec9a5bd1ec22b3fa0aa8c6b849ff48bb6812ab25e45c71c52088691ec14b300fe0e9c2a6933e30354386"

RPROVIDES:${PN} += "cockpit-ws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
distribution-logos \
glib-networking \
glib2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libjson-glib-1.0.so.0 \
libpam.so.0 \
libsystemd.so.0 \
openssl \
permissions \
wallpaper-branding"

inherit rpm
