SUMMARY = "A wrapper around CASACORE, the radio astronomy library"
DESCRIPTION = "A python wrapper around CASACORE, the radio astronomy library"
LICENSE = "LGPL-3.0-or-later"

PV = "3.5.2"

RPM_NAME = "python3-casacore-3.5.2-1.5.aarch64.rpm"
RPM_HASH = "07f9a944af435ee24e12ac15a5a3dcf61237efd9fa1644273b94d0b9ac801cb7741d57a8d3d4eea198ef8b1db3e1402dd73dda891074c665e58151aa6ca77c83"

RPROVIDES:${PN} += "python3-casacore \
python3-casacore(aarch-64) \
python3.10dist(python-casacore) \
python3dist(python-casacore)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libcasa_casa.so.7()(64bit) \
libcasa_derivedmscal.so.7()(64bit) \
libcasa_images.so.7()(64bit) \
libcasa_meas.so.7()(64bit) \
libcasa_measures.so.7()(64bit) \
libcasa_ms.so.7()(64bit) \
libcasa_python3.so.7()(64bit) \
libcasa_scimath.so.7()(64bit) \
libcasa_tables.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python3-configargparse \
python3-future \
python3-numpy \
python3-six"

inherit rpm
