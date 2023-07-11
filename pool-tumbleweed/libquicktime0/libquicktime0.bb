SUMMARY = "Library for Reading and Writing Quicktime Movie Files"
DESCRIPTION = "A library for reading and writing Quicktime movie files, based on and \
forked from quicktime4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime0-1.2.4+git20180804.fff99cd-4.2.aarch64.rpm"
RPM_HASH = "bc74c085fb7c27007d7ac68bdceacf3c41f9533235a6eae2ad1fe2feed098ac05a2ff64d79fc863d32767d7dbc87f53f65799c1ca0c25fdfad1c8d9bcccfedc2"

RPROVIDES:${PN} += "libquicktime.so.0 \
libquicktime0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
