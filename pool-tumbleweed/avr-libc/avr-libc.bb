SUMMARY = "The C Runtime Library for AVR Microcontrollers"
DESCRIPTION = "The C runtime library for the AVR family of microcontrollers for use \
with the GNU toolset (cross-avr-binutils, cross-avr-gcc, uisp, etc.)."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "avr-libc-2.1.0-1.4.noarch.rpm"
RPM_HASH = "dcd046768adfe719f8578c020e7a5e642b921e3af5410a6b2a2a896b41fe0387fd3390c2a70ff43a458b69f294aaeee58160d082d3bb7eedb33baee9c288ef9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avr-libc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
