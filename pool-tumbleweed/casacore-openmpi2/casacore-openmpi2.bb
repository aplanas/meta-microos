SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi2-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "a4fd5a40f9e72ff7d5a1845a95320e390b679150adc87db2c850e3740082856ba775bc5f2fdbb489a474210bc49b2965ee76934f5d0a2307c8db0ba668e662c2"

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
