SUMMARY = "Python bindings for libgensio"
DESCRIPTION = "Python bindings for libgensio, a library for stream and packet I/O \
abscration."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "python3-gensio-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "41a3bfdea34edc8a3bee7a0b3c3db4a67887cbe9067e9e832fc577dfcb387852b78d076229c621011a8f069544bcb98850bdd275cddb036ddcfcda215df959ec"

RPROVIDES:${PN} += "python3-gensio \
python3-gensio(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgensio.so.4()(64bit) \
libgensio_python_swig.so.0()(64bit) \
libgensiocpp.so.4()(64bit) \
libgensiomdns.so.0()(64bit) \
libgensiomdnscpp.so.0()(64bit) \
libgensioosh.so.0()(64bit) \
libgensiooshcpp.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi)"

inherit rpm
