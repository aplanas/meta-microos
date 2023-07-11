SUMMARY = "Documentation for the SDCC C compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC. \
 \
This package contains documentation for SDCC C compiler."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "sdcc-doc-4.2.0-1.4.noarch.rpm"
RPM_HASH = "56eabda3d1fc9992da153cf6bc65786ca08e30cbbb7380b6d163978bdbc5b2aa35b3356e0a922ae3997070944bc3f74f774af7d2a6b8b348f24a31e8a32f8eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdcc-doc"

RDEPENDS:${PN} += ""

inherit rpm
