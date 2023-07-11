SUMMARY = "Development files for the Secret Service API library"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "libsecret-devel-0.20.5-1.8.aarch64.rpm"
RPM_HASH = "9894d4e70d63e956f7e2c984eaa3069f7d00835745639c43eec77187f8e372d7489ebf5b4c5f9cb38750dc3f80b92655708b951fd33a1b8f224713b809b7131c"

RPROVIDES:${PN} += "libsecret-devel \
pkgconfig-libsecret-1 \
pkgconfig-libsecret-unstable"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsecret-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-libgcrypt \
pkgconfig-libsecret-1 \
typelib-1-0-Secret-1"

inherit rpm
