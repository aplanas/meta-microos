SUMMARY = "Tool to inspect RP2040 binaries"
DESCRIPTION = "Picotool is a tool for inspecting RP2040 binaries, and interacting with RP2040 devices when they are in BOOTSEL mode."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "picotool-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "47e0b3bcedb663af310cb1a65f8a88f98fa4109501a247400f89670e8a521c4d8c63f1d8b0f4cbefa7a6258148fb64945d76c8454f52eefbd4fc2bebb8fc98a2"

RPROVIDES:${PN} += "picotool \
picotool(aarch-64)"
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
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
