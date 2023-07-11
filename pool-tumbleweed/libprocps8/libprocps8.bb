SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "libprocps8-3.3.17-12.4.aarch64.rpm"
RPM_HASH = "4c64c01a608d906daf243bf0f76f870011eb488fb52f16f327a00a6677778e0faced64df8c0fd2b56f4df3af7b448b14ace5099314dce50202aeb21fbe4e70ce"

RPROVIDES:${PN} += "libprocps.so.8 \
libprocps8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
