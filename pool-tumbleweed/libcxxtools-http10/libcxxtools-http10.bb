SUMMARY = "A C++ toolbox - HTTP protocol implementation"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-http10-3.0-4.5.aarch64.rpm"
RPM_HASH = "f9d7da034a7dbd20b8ce282d5230eeae9aba5baafc360645911913bcb1087570d86ac5a3fdeb9ad32ac3eb3ce78cbf61ec9bf5c7c805e415267a88279fbe5e4f"

RPROVIDES:${PN} += "libcxxtools-http.so.10()(64bit) \
libcxxtools-http10 \
libcxxtools-http10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcxxtools.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
