SUMMARY = "ANSI Terminal Escape Code Converter"
DESCRIPTION = "Ansifilter handles text files containing ANSI terminal escape codes. \
The command sequences may be stripped or be interpreted to generate formatted \
output (HTML, RTF, TeX, LaTeX, BBCode)."
LICENSE = "GPL-3.0-or-later"

PV = "2.19"

RPM_NAME = "ansifilter-2.19-1.3.aarch64.rpm"
RPM_HASH = "043b1d209c442ca375ff17e93072181426f4fc699b115bd9d4f46199d5828ac24fb6aef49f37ac44fb493f48491835e1fe4c51d092241376fd4d372d0dc22447"

RPROVIDES:${PN} += "ansifilter \
ansifilter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
