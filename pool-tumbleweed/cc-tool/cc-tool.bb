SUMMARY = "Programmer for Texas Instruments 8051-based System-On-Chip devices"
DESCRIPTION = "cc-tool provides support for Texas Instruments CC Debugger for Linux in order \
to program 8051-based System-On-Chip devices: CC254x CC253x CC243x CC251x CC111x."
LICENSE = "GPL-2.0-only"

PV = "0.26"

RPM_NAME = "cc-tool-0.26-1.33.aarch64.rpm"
RPM_HASH = "1b533adb983727e7deed128d2c29d531931f172ef186a92b15ba43047756b84b6d8a43304031bccb270b58af6d49e670a7b62a94dda74bf698416d9f12912ed3"

RPROVIDES:${PN} += "cc-tool \
cc-tool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
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
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
