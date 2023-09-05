SUMMARY = "DjVu rendering library"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "libdjvulibre21-3.5.28-6.1.aarch64.rpm"
RPM_HASH = "b8509f824e2cbf38a626a095b3f5b17dfa02a23cf2eb01b6b13e1e0171041250049442afd752ee0afeb9cfabcc7c6b1d83562cf32ba7d9e5d51d95d520e66dcf"

RPROVIDES:${PN} += "libdjvulibre.so.21 \
libdjvulibre21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
