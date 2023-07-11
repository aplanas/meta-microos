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

RPM_NAME = "libmonosgen-2_0-1-6.12.0-5.4.aarch64.rpm"
RPM_HASH = "6b1f530e89154e5406e722e7100c8133f461b0dbeff7e28790850ce17e646004beaaf25fe881e65f1de635c931c2db3088b026e2350bc8f6c8cec929a9be2537"

RPROVIDES:${PN} += "libmonosgen-2-0-1 \
libmonosgen-2.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
