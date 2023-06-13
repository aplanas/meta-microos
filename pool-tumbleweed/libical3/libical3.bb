SUMMARY = "An Implementation of Basic iCAL Protocols"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
calendaring and scheduling protocols (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical3-3.0.16-1.5.aarch64.rpm"
RPM_HASH = "d3de6e5245f3944ca7d9e98116bf05d5e0b367c40f593a970b6a352991838ef36e147c1fc16062c0a5679f0d53f119dd932592fa993d70f1d7021f19c994ad33"

RPROVIDES:${PN} += "libical \
libical.so.3()(64bit) \
libical3 \
libical3(aarch-64) \
libical_cxx.so.3()(64bit) \
libicalss.so.3()(64bit) \
libicalss_cxx.so.3()(64bit) \
libicalvcal.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
