SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-ws-298-1.1.aarch64.rpm"
RPM_HASH = "687db097f86a92b1e81b81f43894ed0927a61e7168612e7debefd830baafa60e48c1bf66c296c92ff1251b1dabf85c32271dd73af7125a7d67768059b31294b3"

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
