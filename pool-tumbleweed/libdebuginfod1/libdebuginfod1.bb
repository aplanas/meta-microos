SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-0.189-5.1.aarch64.rpm"
RPM_HASH = "0e5176a7a59b26ac1edc41e2ae26da87254769014bf38fdfc08221603cbf3bac9e56cf04ccbc012d63d7ffb134f89c033fb17381e0bfcdd7736da61c2112d1be"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libelf.so.1"

inherit rpm
