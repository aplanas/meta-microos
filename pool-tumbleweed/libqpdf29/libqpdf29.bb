SUMMARY = "Shared libraries for qpdf"
DESCRIPTION = "This packages contains the shared libraries required for the qpdf \
package."
LICENSE = "Apache-2.0"

PV = "11.6.0"

RPM_NAME = "libqpdf29-11.6.0-1.1.aarch64.rpm"
RPM_HASH = "6790dba900173f307b7f4f8956f1556c3a3b3971576c30c0cb93fc90dca5da863ad8f39e5ed4e4bd09b6460ce736a3ae72e252d24675740bb694dfb9670e17b4"

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
