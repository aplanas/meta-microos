SUMMARY = "Extra tools for VapourSynth"
DESCRIPTION = "This package contains the vspipe tool for interfacing with \
VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "62"

RPM_NAME = "vapoursynth-tools-62-1.2.aarch64.rpm"
RPM_HASH = "ac442dafacacec26cebb4355373dfdeb2b10f1e46104909a658b749357250cf104f90f8769a1c94ea5d3af86856bd1e32cbebbaaf7f2d2cb583ab80b3f023207"

RPROVIDES:${PN} += "vapoursynth-tools \
vapoursynth-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvapoursynth-script.so.0()(64bit)"

inherit rpm
