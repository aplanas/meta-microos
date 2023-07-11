SUMMARY = "A library for import of StarOffice documents"
DESCRIPTION = "libstaroffice is a library for import of StarOffice documents."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-0_0-0-0.0.7-3.10.aarch64.rpm"
RPM_HASH = "23e1ef2c583005bcbbd6abeb24b638a0e5a9971869337813555203cffa6adc27dcf94aa5c7d40c65993622d9488300cd1a7386618217a3fb036ed355e229945e"

RPROVIDES:${PN} += "libstaroffice-0-0-0 \
libstaroffice-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
