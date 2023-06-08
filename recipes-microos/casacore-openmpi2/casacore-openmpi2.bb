SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi2-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "a4fd5a40f9e72ff7d5a1845a95320e390b679150adc87db2c850e3740082856ba775bc5f2fdbb489a474210bc49b2965ee76934f5d0a2307c8db0ba668e662c2"

RPROVIDES:${PN} += "casacore-openmpi2 casacore-openmpi2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcasa_casa.so.7()(64bit) libcasa_coordinates.so.7()(64bit) libcasa_fits.so.7()(64bit) libcasa_images.so.7()(64bit) libcasa_lattices.so.7()(64bit) libcasa_measures.so.7()(64bit) libcasa_ms.so.7()(64bit) libcasa_msfits.so.7()(64bit) libcasa_scimath.so.7()(64bit) libcasa_tables.so.7()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libmpi.so.20()(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
