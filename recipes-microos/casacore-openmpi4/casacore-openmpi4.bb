SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi4-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "6b49104ea92216245fd6be00d2cc6aac883c802ac537fbd3c95a1ed8237df8b2c2e15c45b8ebe5a2cffc17eac998cd6235086348f3d8cae8bca79bebf65f6982"

RPROVIDES:${PN} += "casacore-openmpi4 casacore-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcasa_casa.so.7()(64bit) libcasa_coordinates.so.7()(64bit) libcasa_fits.so.7()(64bit) libcasa_images.so.7()(64bit) libcasa_lattices.so.7()(64bit) libcasa_measures.so.7()(64bit) libcasa_ms.so.7()(64bit) libcasa_msfits.so.7()(64bit) libcasa_scimath.so.7()(64bit) libcasa_tables.so.7()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libmpi.so.40()(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
