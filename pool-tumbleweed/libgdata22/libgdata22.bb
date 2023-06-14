SUMMARY = "GLib-based library for accessing online service APIs using the GData protocol"
DESCRIPTION = "libgdata is a GLib-based library for accessing online service APIs using \
the GData protocol — most notably, Google's services. It provides APIs \
to access the common Google services, and has full asynchronous support."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "libgdata22-0.18.1-3.3.aarch64.rpm"
RPM_HASH = "a3f0a7512759e54430eae71c0032d863a65c693031066f0b3b7e9951618844ee942bba7645399c567727e013366eccc8f66073a7da8f713380e911e9ff3c35eb"

RPROVIDES:${PN} += "libgdata \
libgdata.so.22 \
libgdata22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2"

inherit rpm
