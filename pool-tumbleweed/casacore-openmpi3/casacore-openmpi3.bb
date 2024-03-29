SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi3-3.5.0-2.14.aarch64.rpm"
RPM_HASH = "094a215df69fc71fd773a3787f76c0095088502a9dfac3df3846fc2ee131e756c176baf28c469af45b6c2583f49289efaaf842333ab992c6ea7e5b07e091e5a4"

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
