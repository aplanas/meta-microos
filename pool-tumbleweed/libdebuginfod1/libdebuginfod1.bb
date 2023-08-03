SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-0.189-4.1.aarch64.rpm"
RPM_HASH = "3562ce188245773c71f7636059ff38117b7c410005966bc8757abfa667a47435f6ab17f5805ad98e9988c0007aa685313065d2d75bbe7db10905c08bfcb7b7f9"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libelf.so.1"

inherit rpm
