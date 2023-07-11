SUMMARY = "Shared library for zinnia"
DESCRIPTION = "This package contains shared libraries used by zinnia."
LICENSE = "BSD-3-Clause"

PV = "0.07"

RPM_NAME = "libzinnia0-0.07-2.8.aarch64.rpm"
RPM_HASH = "8de722eb9c67330018f3e99cc56de37790fe08a7288ac3bec39f2030affd865603fd70fbebfea3ac3a50be5a0ad815816c7a94f492602cecbed33c16bf9ef09e"

RPROVIDES:${PN} += "libzinnia.so.0 \
libzinnia0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
