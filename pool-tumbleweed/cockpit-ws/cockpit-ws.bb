SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later"

PV = "293"

RPM_NAME = "cockpit-ws-293-1.1.aarch64.rpm"
RPM_HASH = "9d8ec114bc8c4307deccc6cc9d4ae78de5448494c33263b976cd98a5fe6cea4fdea7f108da5864934c2db0db40a164f9d9a79824d18c8c7b24cb0aa457c5a8d6"

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
