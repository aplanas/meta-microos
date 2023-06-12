SUMMARY = "The procps library"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "libproc2-0-4.0.3-1.3.aarch64.rpm"
RPM_HASH = "2f2b6f0837d8e8addf8fb3be34cf69f2d9b8b53580c8734af789312b3555aff8aa6185fb11b105163c435847f61713824514573e41c466f4c5ab9431afc15ced"

RPROVIDES:${PN} += "libproc2-0 \
libproc2-0(aarch-64) \
libproc2.so.0()(64bit) \
libproc2.so.0(LIBPROC_2)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
