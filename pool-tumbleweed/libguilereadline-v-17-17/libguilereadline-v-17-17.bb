SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguilereadline-v-17-17-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "7d56d8e80dc19bc3399c28fc97e43db0221db662629c8665a5c4bc68b42c5d8211f08fb4ee71e8585cb424e1161f48f63a5f4c9cde829cbd9b6992282f578e85"

RPROVIDES:${PN} += "libguilereadline-v-17-17 \
libguilereadline-v-17.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile.so.17 \
libreadline.so.8"

inherit rpm
