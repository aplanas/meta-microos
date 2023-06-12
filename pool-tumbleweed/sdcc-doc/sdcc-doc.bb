SUMMARY = "Documentation for the SDCC C compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC. \
 \
This package contains documentation for SDCC C compiler."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "sdcc-doc-4.2.0-1.3.noarch.rpm"
RPM_HASH = "aae851d3732dd502965801f86d18ac927892baff82472875159e3b8660b9ad7d10ccc63c8dba08cd4c5bbd8b58db0c54a7edbfa46d911f8c5ca77262b3c372db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdcc-doc"
RDEPENDS:${PN} += ""

inherit rpm
