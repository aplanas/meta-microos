SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - mdns support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensiomdns0-2.6.1-1.6.aarch64.rpm"
RPM_HASH = "85f4be95d63fa5e281aa151e3fa6fb220127a217961c59585bae6be28e18a5b762184945223c9ac9688bb679a48e2717791ac3bd5e80f53553f8e854d53f0a4f"

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
