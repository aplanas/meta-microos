SUMMARY = "Small Device C Compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC. \
 \
This package contains sources for the C library and other files for \
development."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "sdcc-libc-sources-4.2.0-1.4.noarch.rpm"
RPM_HASH = "8ebd13be45ab750fa8c0120981f011cf426a000142a542380e5a269dc035b88669cf9518ccf77ab5074d0e0cab39ecd8735ef81ebe8f549a983c52c00252c4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdcc-libc-sources"

RDEPENDS:${PN} += "/usr/bin/sh \
sdcc"

inherit rpm
