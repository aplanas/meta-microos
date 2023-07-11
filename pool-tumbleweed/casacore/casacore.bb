SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "e6539c5cdd94f6eecc6cde3d90a5fbad7124f09602c92f04a9ded68026590f7ad707edc47e55168139e99f29a93f940e323199d8664f96d1628d817ac34ab203"

RPROVIDES:${PN} += "casacore"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcasa-casa.so.7 \
libcasa-coordinates.so.7 \
libcasa-fits.so.7 \
libcasa-images.so.7 \
libcasa-lattices.so.7 \
libcasa-measures.so.7 \
libcasa-ms.so.7 \
libcasa-msfits.so.7 \
libcasa-scimath.so.7 \
libcasa-tables.so.7 \
libgcc-s.so.1 \
libgomp.so.1 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
