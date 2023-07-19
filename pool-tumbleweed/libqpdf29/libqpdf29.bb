SUMMARY = "Shared libraries for qpdf"
DESCRIPTION = "This packages contains the shared libraries required for the qpdf \
package."
LICENSE = "Apache-2.0"

PV = "11.5.0"

RPM_NAME = "libqpdf29-11.5.0-1.1.aarch64.rpm"
RPM_HASH = "b2eb88598418ca56932125c3c507266f5b628ae75769bcd6026d15addbdcf1402a296c5a213c40fbb87a6d2a2396da22855a6421877e7cb9ef25591f805d6f38"

RPROVIDES:${PN} += "libqpdf.so.29 \
libqpdf29"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libjpeg.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
