SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi1-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "5d23dae52962ad4b6684e2ccd7a85505ef0dcae7abbea447f4848625c6582f77885e578aedf8582c8022d44098172df7638aad8a57a0098f5ef306a9cde32a85"

RPROVIDES:${PN} += "casacore-openmpi1"

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
libmpi.so.12 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
