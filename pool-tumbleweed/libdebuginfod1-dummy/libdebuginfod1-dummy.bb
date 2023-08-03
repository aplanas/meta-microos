SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-dummy-0.189-4.1.aarch64.rpm"
RPM_HASH = "ba043b3580aaaa6591ca697f297d44c8eb9966aa396bcb3fdcb70b8bd594ab90a15994893180e889cef035a982b05944fdb50ea33cd29107c9e4d05a8f8a0cd9"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1 \
libdebuginfod1-dummy"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
