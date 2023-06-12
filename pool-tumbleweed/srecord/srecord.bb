SUMMARY = "Hex/bin format conversion package"
DESCRIPTION = "The srecord package is a collection of powerful tools for manipulating EPROM \
load files. It reads and writes numerous EPROM file formats, and can perform \
many different manipulations."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "srecord-1.64-4.32.aarch64.rpm"
RPM_HASH = "abf6aa7f8a4d7f9f60d2d64809137b6696fe014d574199a61632483ad0b720f87e05947707c79f85266e51443702aca976eb24ae73cef10cc0b5e7c6c958236a"

RPROVIDES:${PN} += "srecord \
srecord(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libsrecord.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
