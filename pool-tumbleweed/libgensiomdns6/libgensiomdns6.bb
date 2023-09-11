SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - mdns support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.7.5"

RPM_NAME = "libgensiomdns6-2.7.5-1.1.aarch64.rpm"
RPM_HASH = "09a2059c2c34972df0bbd0690a6ec0c938dc403aac5b0470f725478452ee4532063bb196a3725d6065723507d33729c8bce28addd033b3a943c5020690c05f8b"

RPROVIDES:${PN} += "libgensiomdns.so.6 \
libgensiomdns6 \
libgensiomdnscpp.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgensioosh.so.6 \
libgensiooshcpp.so.6 \
libstdc++.so.6"

inherit rpm
