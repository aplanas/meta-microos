SUMMARY = "GStreamer plugin for the Interactive Connectivity Establishment"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "gstreamer-libnice-0.1.21-3.1.aarch64.rpm"
RPM_HASH = "1e13f1423f419a9a2bcfcee1ebf39ddc2c925368749857371d6cc3c4414fe4fcb37568bf45f132814d0185e162b45a4f9f16acb1a267cfe9eec5c0334044b93b"

RPROVIDES:${PN} += "gstreamer-libnice \
gstreamer1 \
libgstnice.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libnice.so.10"

inherit rpm
