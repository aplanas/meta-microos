SUMMARY = "Shared libraries for qpdf"
DESCRIPTION = "This packages contains the shared libraries required for the qpdf \
package."
LICENSE = "Apache-2.0"

PV = "11.4.0"

RPM_NAME = "libqpdf29-11.4.0-1.1.aarch64.rpm"
RPM_HASH = "8883ae00aa2cc2eeb1145101b8a4ffba1ad5c70bafa1e05fd570a6ccc09dcbe281a456fd628d4ae8804f814749f97392f8a9d8d4a9955499ad8cc4fc1c90e7a4"

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
