SUMMARY = "Source Code Indenter, Formatter, and Beautifier for C, C++, C# and Java"
DESCRIPTION = "Artistic Style is a source code indenter, formatter, and beautifier for the C, \
C++, C# and Java programming languages. It automatically re-indents and \
re-formats C / C++ / C# / Java source files. It can be used from a command \
line, or it can be incorporated as classes in another C++ program."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "astyle-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "52c0b2fb88806910e0a6651468d05905589e17e2d22058035a7ed74a6086f0bf0f4e3f903a9b1ae1c6b8fade414bdf95f87a2029f7b81e1e35f55f19f3341e8b"

RPROVIDES:${PN} += "astyle \
astyle(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
