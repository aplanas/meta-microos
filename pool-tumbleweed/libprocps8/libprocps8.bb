SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "libprocps8-3.3.17-14.1.aarch64.rpm"
RPM_HASH = "f94a35c7bab8ca47a995c525187f46d1f13dbce7a053c464307e86bc168790eedfa4be84d4553dd74abe0990ef1f3fb4de252a1754344d792d121275e462659b"

RPROVIDES:${PN} += "libprocps.so.8 \
libprocps8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
