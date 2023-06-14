SUMMARY = "Client library for the user account information manipulation D-Bus service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides a client library for the service."
LICENSE = "GPL-3.0-or-later"

PV = "22.08.8"

RPM_NAME = "libaccountsservice0-22.08.8-2.4.aarch64.rpm"
RPM_HASH = "f652243c4083880b9ed7e18816a3a5b96ca9e9992aaf1fbc37d15e767101b0c287dd4d2767f7afd704077f5a8f92682f264c58a2266988e330918d668ebbf493"

RPROVIDES:${PN} += "libaccountsservice.so.0 \
libaccountsservice0"

RDEPENDS:${PN} += "/sbin/ldconfig \
accountsservice \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
