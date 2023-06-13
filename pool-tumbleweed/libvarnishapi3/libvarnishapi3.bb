SUMMARY = "Shared libraries for Varnish"
DESCRIPTION = "Varnish is an HTTP accelerator. Often called Reverse Proxy, it is an \
application that stores (caches) documents that have been requested \
over the HTTP protocol. \
 \
Based on certain criteria, the next client requesting the document is either \
given the cached document, or a 'fresh' document requested from a backend \
server. The purpose of this is to minimize the requests going to the backend \
server(s) by serving the same document to potentially many users. \
 \
This package holds the shared libraries for varnish."
LICENSE = "BSD-2-Clause"

PV = "7.2.1"

RPM_NAME = "libvarnishapi3-7.2.1-1.3.aarch64.rpm"
RPM_HASH = "75fefc38019729896d43203ffb8836bb33357462299744a2d95a9250a3da48828d81a033d9cdd1e21a248821f8d73dd575282cb1f6f63a50d1c2fa2f1cf57680"

RPROVIDES:${PN} += "libvarnishapi.so.3()(64bit) \
libvarnishapi.so.3(LIBVARNISHAPI_3.0)(64bit) \
libvarnishapi3 \
libvarnishapi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm
