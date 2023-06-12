SUMMARY = "A C++ toolbox - XMLRPC package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-xmlrpc10-3.0-4.5.aarch64.rpm"
RPM_HASH = "67b386115176c45fd6148b89dec71df55dfbe19265f53e2e4bdef20964132afb069dc459cb11a20d46919df08a190b585208d238b6f735a8576a7883cbd85b19"

RPROVIDES:${PN} += "libcxxtools-xmlrpc.so.10()(64bit) \
libcxxtools-xmlrpc10 \
libcxxtools-xmlrpc10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libcxxtools-http.so.10()(64bit) \
libcxxtools.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
