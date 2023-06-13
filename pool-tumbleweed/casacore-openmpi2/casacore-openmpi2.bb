SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi2-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "a4fd5a40f9e72ff7d5a1845a95320e390b679150adc87db2c850e3740082856ba775bc5f2fdbb489a474210bc49b2965ee76934f5d0a2307c8db0ba668e662c2"

RPROVIDES:${PN} += "casacore-openmpi2 \
casacore-openmpi2(aarch-64)"

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
libmpi.so.20()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
