SUMMARY = "The C Runtime Library for AVR Microcontrollers"
DESCRIPTION = "The C runtime library for the AVR family of microcontrollers for use \
with the GNU toolset (cross-avr-binutils, cross-avr-gcc, uisp, etc.)."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "avr-libc-2.1.0-1.3.noarch.rpm"
RPM_HASH = "a0242d4615c804be144065779899f3e94547b4b62a7502de41ff68bc3a78d77ca015158a861d5e953299fb7e19b5e653906a5116e21e0c125b7bef6057e2b833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avr-libc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
