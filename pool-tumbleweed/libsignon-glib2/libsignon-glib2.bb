SUMMARY = "Library for signond"
DESCRIPTION = "GLib-based client library for applications handling account \
authentication through the Online Accounts Single Sign-On service \
 \
This package provides shared libraries for libsignon-glib"
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "libsignon-glib2-2.1-1.17.aarch64.rpm"
RPM_HASH = "d3d338308b202c6922b01fbb11537614a6634ec77fa4f761a8878831e11762a6352216bfcfd088558409e435b6f52665f32773ee2561502d50566d9dd0b5e7dd"

RPROVIDES:${PN} += "libsignon-glib.so.2()(64bit) \
libsignon-glib2 \
libsignon-glib2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
