SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-0.189-3.2.aarch64.rpm"
RPM_HASH = "0ca3e8479b738f6fc937b734ce78f1fec8829cf4f7294604430b832167368f39131677e874acddd9fa367914f8487342ee4c191c54280230a80df90237daa217"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libelf.so.1"

inherit rpm
