SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi1-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "f4bec8c55f1f6b883042ad07eb10855add897722930b34cf5c91a4c3a4e2db6596e03a14d570831b20e525650e0a99a41bf648cd1d1c9b6bd7137102b471452c"

RPROVIDES:${PN} += "casacore-openmpi1 \
casacore-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcasa_casa.so.7()(64bit) \
libcasa_coordinates.so.7()(64bit) \
libcasa_fits.so.7()(64bit) \
libcasa_images.so.7()(64bit) \
libcasa_lattices.so.7()(64bit) \
libcasa_measures.so.7()(64bit) \
libcasa_ms.so.7()(64bit) \
libcasa_msfits.so.7()(64bit) \
libcasa_scimath.so.7()(64bit) \
libcasa_tables.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libmpi.so.12()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
