SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi3-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "06fefe83fce06c2e4a5642900a4ed22beb827f1254cf3718bdfdf52194f60d5a42fda143ca94bcb915c5d798af9d5a2f7b68162356b0bf2b830d69e295b6067a"

RPROVIDES:${PN} += "casacore-openmpi3"

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
libmpi.so.40 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
