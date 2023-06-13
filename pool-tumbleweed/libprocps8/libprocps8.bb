SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "libprocps8-3.3.17-12.3.aarch64.rpm"
RPM_HASH = "87e036f1497055819b7304baa111354f21880332332d7eb6a775855c9d38d7a2196be16a6f401b944986fdc6c99e8e95b6bf7abe09cbc08d5e59a14dca3fa193"

RPROVIDES:${PN} += "libprocps.so.8()(64bit) \
libprocps.so.8(LIBPROCPS_0)(64bit) \
libprocps8 \
libprocps8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
