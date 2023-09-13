SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-dummy-0.189-5.1.aarch64.rpm"
RPM_HASH = "dc4d99a1b42d8c2ca1701119427d18cecaa722748cdeb8398451b1ea8c61311c9bec98391dbf58ddf30a105481261a09b8073059c9336452904fe2a9310e43f5"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1 \
libdebuginfod1-dummy"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
