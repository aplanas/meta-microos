SUMMARY = "Library for signond"
DESCRIPTION = "GLib-based client library for applications handling account \
authentication through the Online Accounts Single Sign-On service \
 \
This package provides shared libraries for libsignon-glib"
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "libsignon-glib2-2.1-1.18.aarch64.rpm"
RPM_HASH = "f95793c72f0d1d4bbf0dbcdd34995037dc83e6e92822cac562b0ac7ee964d2beb726f1f951e07146cb7e29d9046d55e5577807bdfc865e24bb037ec4f631b822"

RPROVIDES:${PN} += "libsignon-glib.so.2 \
libsignon-glib2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
