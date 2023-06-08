SUMMARY = "Android platform tools"
DESCRIPTION = "Android SDK Platform-Tools is a component for the Android SDK. \
It includes tools that interface with the Android platform."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.0"

RPM_NAME = "android-tools-34.0.0-1.2.aarch64.rpm"
RPM_HASH = "b5282b0e800b3aaba9584d7837fdae18fae1fed0312c23d34b7b2c1b25f1baca793b09f79a4b3756f04d0d65fcb4df5891be3b86250c17035b4113f701c9e36d"

RPROVIDES:${PN} += "android-tools android-tools(aarch-64) android-tools-python3"
RDEPENDS:${PN} += "/usr/bin/python3 android-udev-rules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libbrotlienc.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) liblz4.so.1()(64bit) libpcre2-8.so.0()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libusb-1.0.so.0()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit) python3"

inherit rpm
