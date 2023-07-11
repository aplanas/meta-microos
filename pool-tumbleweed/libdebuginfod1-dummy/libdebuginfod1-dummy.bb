SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-dummy-0.189-3.3.aarch64.rpm"
RPM_HASH = "cc61b2e7a7ea36d9b24aa98af951b9ea953e1c8e4e7a8e287bcbbfacb672f47d172686627f48a27ae5aa64767dd80debe617fc0590a507fa33653aca973ae340"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1 \
libdebuginfod1-dummy"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
