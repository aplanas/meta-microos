SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi4-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "6b49104ea92216245fd6be00d2cc6aac883c802ac537fbd3c95a1ed8237df8b2c2e15c45b8ebe5a2cffc17eac998cd6235086348f3d8cae8bca79bebf65f6982"

RPROVIDES:${PN} += "casacore-openmpi4"

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
libmpi.so.40 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
