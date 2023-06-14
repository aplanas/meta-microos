SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "ea96a071a25c6dd916c350e447e617b9434fc2db5b5a8116e7701612e8866bff10c57696abe22146d83286e4b79d344820fc71479862cbce9f05be5cb5730530"

RPROVIDES:${PN} += "casacore"

RDEPENDS:${PN} += "/bin/sh \
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
