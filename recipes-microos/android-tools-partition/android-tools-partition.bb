SUMMARY = "Android dynamic partition tools"
DESCRIPTION = "This package contains the Android dynamic partition tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.0"

RPM_NAME = "android-tools-partition-34.0.0-1.2.aarch64.rpm"
RPM_HASH = "8dd990b807ef22b8e0407fba24bd0c18ea0b4e38bb634a985032424e26a1beff5021a92b7b09d54603799feae1e98660ac31e72712ecbbc6369560275d212b89"

RPROVIDES:${PN} += "android-tools-partition android-tools-partition(aarch-64)"
RDEPENDS:${PN} += "android-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
