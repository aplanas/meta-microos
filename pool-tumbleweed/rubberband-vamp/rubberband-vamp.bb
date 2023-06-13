SUMMARY = "Vamp plugins for librubberband"
DESCRIPTION = "This package contains the following Vamp plugins: \
 * increments (Output Increments): Output time increment for each \
   input step \
 * aggregate_increments (Accumulated Output Increments): Accumulated \
   output time increments \
 * divergence (Divergence from Linear): Difference between actual \
   output time and the output time for a theoretical linear stretch \
 * phaseresetdf (Phase Reset Detection Function): Curve whose peaks \
   are used to identify transients for phase reset points \
 * smoothedphaseresetdf (Smoothed Phase Reset Detection Function): \
   Phase reset curve smoothed for peak picking \
 * phaseresetpoints (Phase Reset Points): Points estimated as \
   transients at which phase reset occurs \
 * timesyncpoints (Time Sync Points): Salient points which stretcher \
   aims to place with strictly correct timing"
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-vamp-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "2b411e76d68a47e0801f237dbc2f272b6cfd06b6cb3b0ff019378b9245a14255a76f68dde31a38023127e5a7114a975d49a0bc3ec4c3a14c3bd087d5d9a0dad6"

RPROVIDES:${PN} += "rubberband-vamp \
rubberband-vamp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librubberband2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvamp-sdk.so.2()(64bit)"

inherit rpm
