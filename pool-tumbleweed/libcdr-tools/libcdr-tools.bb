SUMMARY = "Tools to work with documents in Corel Draw file format"
DESCRIPTION = "Tools to work with documents in Corel Draw file format."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-tools-0.1.7-1.18.aarch64.rpm"
RPM_HASH = "b4e7c02ff11e0da65246a93524d940f2e03d4da15a79c3b99b0c9192a7e64fb52100441a003e0debacaf8093c8437a6699e67d07f544d2a8278047008dfd6502"

RPROVIDES:${PN} += "libcdr-tools \
libcdr-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdr-0.1.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
librevenge-0.0.so.0()(64bit) \
librevenge-generators-0.0.so.0()(64bit) \
librevenge-stream-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm
