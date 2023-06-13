SUMMARY = "Visualizer for estimated instantaneous bandwidth on USB buses and devices"
DESCRIPTION = "A top-like utility that shows an estimated instantaneous bandwidth on USB buses and devices. \
 \
Requires the usbmon kernel module to be loaded."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "usbtop-1.0-2.18.aarch64.rpm"
RPM_HASH = "f8e6a0f92d3a6cfce35d55a7da0790af8a46bfd2cde1f50573a88bbf967d47b9d6faa5c68e28bb10f92982e07a8b52cdada1cc1b0903de36adf550fe23a33274"

RPROVIDES:${PN} += "usbtop \
usbtop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpcap.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
