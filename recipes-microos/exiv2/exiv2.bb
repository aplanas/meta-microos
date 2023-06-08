SUMMARY = "Tool to access image Exif metadata"
DESCRIPTION = "Exiv2 is a command line utility to access image metadata from tags like \
Exif."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.27.6"

RPM_NAME = "exiv2-0.27.6-3.3.aarch64.rpm"
RPM_HASH = "3839c580f78d03c850609bc7b46e3254b27975df0a0e4f45c8dd4eb46fa3e6fe1a691869637695b790c4d2b7d2b033e2519d8b7077b5efe68e8d6ad4d49b850d"

RPROVIDES:${PN} += "exiv2 exiv2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexiv2.so.27()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
