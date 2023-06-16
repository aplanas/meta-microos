SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-ws-276.1-4.4.aarch64.rpm"
RPM_HASH = "5c2a3638c84653332424bae77b8b4911d99da062417ae2c5cad819e0d32f133a069d33579564923498319a6c688488b739f19b98707fb10e492a32a149396797"

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
