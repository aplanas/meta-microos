SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "libprocps8-3.3.17-12.3.aarch64.rpm"
RPM_HASH = "87e036f1497055819b7304baa111354f21880332332d7eb6a775855c9d38d7a2196be16a6f401b944986fdc6c99e8e95b6bf7abe09cbc08d5e59a14dca3fa193"

RPROVIDES:${PN} += "libprocps.so.8 \
libprocps8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
