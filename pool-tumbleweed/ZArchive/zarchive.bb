SUMMARY = "Library and program for creating and reading .zar files"
DESCRIPTION = "Program and library for handling ZArchive .zar files. ZArchive files are zstd-compressed file archives."
LICENSE = "MIT-0"

PV = "0.1.2+git20220908.d2c7177"

RPM_NAME = "ZArchive-0.1.2+git20220908.d2c7177-3.1.aarch64.rpm"
RPM_HASH = "99039410464751f844ff6a090f584db25a667b935667bca24fbe4811c931278eb7d5fe43b162bce4ba18ee692ce1e88a14178b3a9eced3598e18557a52f35a65"

RPROVIDES:${PN} += "ZArchive \
ZArchive(aarch-64)"

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
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libzarchive.so.0.1()(64bit)"

inherit rpm
