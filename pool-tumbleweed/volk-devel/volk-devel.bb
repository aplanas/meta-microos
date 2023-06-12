SUMMARY = "Development files for VOLK"
DESCRIPTION = "This package provides the the development files for VOLK."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "volk-devel-3.0.0-1.3.aarch64.rpm"
RPM_HASH = "b3014090138fe4938c326b95d0f61d19258db604932285c1eb7088070921225863c9f4fd32bbffb87698635d0de517e7838e0d3d083fd11cd1a9f356f0bebc1f"

RPROVIDES:${PN} += "cmake(Volk) \
gnuradio-devel:/usr/lib64/pkgconfig/volk.pc \
pkgconfig(volk) \
volk-devel \
volk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
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
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvolk.so.3.0()(64bit) \
libvolk3_0"

inherit rpm