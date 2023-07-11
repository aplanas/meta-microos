SUMMARY = "Netscape Portable Runtime"
DESCRIPTION = "NSPR provides platform independence for non-GUI operating system \
facilities. These facilities include threads, thread synchronization, \
normal file and network I/O, interval timing and calendar time, basic \
memory management (malloc and free), and shared library linking."
LICENSE = "MPL-2.0"

PV = "4.35"

RPM_NAME = "mozilla-nspr-4.35-1.4.aarch64.rpm"
RPM_HASH = "33c94f8eab6cf426ba8c74c9fd850153848bf27cebeac947cb84c874a6f38df6b56607ad873d640414f309d45aa50850545d384a4b4cb77e0696f56186e8deaa"

RPROVIDES:${PN} += "libnspr4.so \
libplc4.so \
libplds4.so \
mozilla-nspr"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
