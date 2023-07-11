SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-13-14-v-3-3-1.8.8-23.12.aarch64.rpm"
RPM_HASH = "b855baf095ec93573ef06a1653b2f3a4737da49c7b9ea69c86915ffd9912927211e8c304c0ac643406147faae822a8958d9f94a4c9a0a58b121e22b24af17d95"

RPROVIDES:${PN} += "libguile-srfi-srfi-13-14-v-3-3 \
libguile-srfi-srfi-13-14-v-3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
