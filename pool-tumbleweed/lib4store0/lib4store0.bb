SUMMARY = "4store RDF Storage Library"
DESCRIPTION = "This package provides 4store RDF storage shared library."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "lib4store0-1.1.6-3.15.aarch64.rpm"
RPM_HASH = "3ca316dae9d3fad90c9709c6473c8ebc59d605d7b4da7fd97fdadea5b5a83da2e9fa5889258071b9f38c8c03c660735018b8063b36766120ab7cba907213741d"

RPROVIDES:${PN} += "lib4store.so.0 \
lib4store0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
