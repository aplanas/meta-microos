SUMMARY = "Java bindings for mraa"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware. With board \
detection done at runtime, you can create portable code that will work \
across the supported platforms. \
 \
This package contains java bindings for mraa."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "java-mraa-2.2.0-2.10.aarch64.rpm"
RPM_HASH = "b021e745d6d9ef123e70d1d54448e4fa853bc2ce9509f89fda70d1348f913bac311a6953a6943509d85383e4f204d571a235e77e8a2506e3fedffa880f0fc843"

RPROVIDES:${PN} += "java-mraa \
java-mraa(aarch-64) \
libmraajava.so()(64bit) \
pkgconfig(mraajava)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
javapackages-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libmraa.so.2()(64bit) \
libmraa2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
