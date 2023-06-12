SUMMARY = "Headers and libraries for the belr library"
DESCRIPTION = "Belr parses input formatted according to a language defined by an \
ABNF grammar, such as the protocols standardised at IETF. \
 \
This package contains header files and development libraries needed \
to develop applications using the belr library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.51"

RPM_NAME = "belr-devel-5.2.51-1.1.aarch64.rpm"
RPM_HASH = "7f65c819f1eb7d5f513dce57e8e598c8368311f1c7910d0134bf05f5a706bee0b82a80d7d694b419956cba9b7f620fa6e4257fd046ed07e98641338cbefa1c57"

RPROVIDES:${PN} += "belr-devel \
belr-devel(aarch-64) \
cmake(belr) \
pkgconfig(belr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbctoolbox-tester.so.1()(64bit) \
libbctoolbox.so.1()(64bit) \
libbelr.so.1()(64bit) \
libbelr1 \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
pkgconfig(bctoolbox)"

inherit rpm
