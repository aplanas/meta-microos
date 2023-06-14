SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - mdns support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensiomdns0-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "62e183868bf28c5f1b5ded06adb0f9a907c270297301df20b98c6bff9d1cf0f076319537479ca1b374c08d18f1f44c14016da420a494356a6bb866bc4ab122db"

RPROVIDES:${PN} += "libgensiomdns.so.0 \
libgensiomdns0 \
libgensiomdnscpp.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgensioosh.so.0 \
libgensiooshcpp.so.0 \
libstdc++.so.6"

inherit rpm
