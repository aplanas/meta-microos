SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi2-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "ee7f7c6db08a797263513a8f991ef227420cbdf5038fb4d316f0cf951dab0761e2345fc419d148245cc826503f14134947e56381efb2c33404c07f6836491784"

RPROVIDES:${PN} += "casacore-openmpi2"

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
libmpi.so.20 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
