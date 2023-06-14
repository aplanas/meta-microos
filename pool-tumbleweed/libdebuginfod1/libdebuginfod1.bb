SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-0.189-3.1.aarch64.rpm"
RPM_HASH = "d0958934699c6e8a64e62a164b2e5ead9a2ff632f8b62c49078baa578c29e2d3fe4313ac4f1480c33997336a9d5752669ff1880d5dbcdccbadbe47cfef7e283f"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libelf.so.1"

inherit rpm
