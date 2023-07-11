SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-0_0-0-0.0.3-1.4.aarch64.rpm"
RPM_HASH = "c4fc62a4c3cf8d27d8ce0cb233ec02964237ef71050e4b92fa79a1c432e99c6cba97eabbbf0a6d78f0db7471548fc624f8faee54e87e3c020413465cb7fcd61a"

RPROVIDES:${PN} += "librvngabw-0-0-0 \
librvngabw-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
