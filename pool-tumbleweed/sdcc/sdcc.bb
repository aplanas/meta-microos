SUMMARY = "Small Device C Compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "sdcc-4.2.0-1.4.aarch64.rpm"
RPM_HASH = "0af15b771e7b64662ffc627739ccaef2f903fb3637be1557dce45664ef9e8591f05bcc0705ac6052896f19c2483a5a15669c1cba99e55ec228fba11c0442536a"

RPROVIDES:${PN} += "sdcc"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
