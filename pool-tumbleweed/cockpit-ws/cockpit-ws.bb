SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later"

PV = "298"

RPM_NAME = "cockpit-ws-298-2.1.aarch64.rpm"
RPM_HASH = "1dac31591da85b217074cef4d678ac5d7bf2c9bdcc61773d65ff680f597d102b868d3af08fc41ce815621f07e24bf7135bb58a72f5ab442483a06f6cc4d4ab77"

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
