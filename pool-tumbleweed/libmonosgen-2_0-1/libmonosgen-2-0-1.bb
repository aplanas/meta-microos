SUMMARY = "A Library for embedding Mono in your Application (SGen GC)"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
A Library for embedding Mono in your application using the precise SGen \
garbage collector."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmonosgen-2_0-1-6.12.0-5.3.aarch64.rpm"
RPM_HASH = "0659a4ad3a07305321baec71dfbbfa13f1c92740f34a02ebaaa23b4e0ab4832dca2fa75d78e6457b17c0e5aec8b8051937908ebd2eb46705692de1a98952da26"

RPROVIDES:${PN} += "libmonosgen-2.0.so.1()(64bit) \
libmonosgen-2_0-1 \
libmonosgen-2_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libz.so.1()(64bit)"

inherit rpm
