SUMMARY = "DjVu rendering library"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the shared libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "libdjvulibre21-3.5.28-5.1.aarch64.rpm"
RPM_HASH = "042c4e309b305b6f267aff84ba32fddc734a4c4126b6b5d142dd5fb028af84be81db0cb4dbbb7230647f48efdb474bb37e95e19cb940c999ebf0bf6b208aa5f3"

RPROVIDES:${PN} += "libdjvulibre.so.21()(64bit) \
libdjvulibre21 \
libdjvulibre21(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
