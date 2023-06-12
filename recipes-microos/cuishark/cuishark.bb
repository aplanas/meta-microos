SUMMARY = "A protocol analyzer like a wireshark on CUI"
DESCRIPTION = "A console based wireshark like protocol analyzer. \
It is using libwireshark for the protocol dissection."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "cuishark-0.1.2-2.12.aarch64.rpm"
RPM_HASH = "9a7483c8d8c424354419403df97123c7ca50cf67e88c79d85b310aa9d27ff4d73356a2064276ec6bd7c6fd51417570949b31beaf8c6e06e907ebece97cbb76a3"

RPROVIDES:${PN} += "cuishark \
cuishark(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libpcap.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
