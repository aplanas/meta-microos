SUMMARY = "Library to provide generic file data functions"
DESCRIPTION = "Library to provide generic file data functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libfdata1-20230319-1.1.aarch64.rpm"
RPM_HASH = "f858a68fd95201272c2e0db272abf1d76ffe3ce8206a1e1a97f7fbfe73dddb043e67ddad2f4dcab8c7e1d50e1cca44a40cd32c9634ed3baab072032d1fb4f93b"

RPROVIDES:${PN} += "libfdata.so.1 \
libfdata1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfcache.so.1"

inherit rpm
