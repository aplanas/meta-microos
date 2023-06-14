SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi1-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "f4bec8c55f1f6b883042ad07eb10855add897722930b34cf5c91a4c3a4e2db6596e03a14d570831b20e525650e0a99a41bf648cd1d1c9b6bd7137102b471452c"

RPROVIDES:${PN} += "casacore-openmpi1"

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
libmpi.so.12 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
