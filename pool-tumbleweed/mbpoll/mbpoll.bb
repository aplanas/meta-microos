SUMMARY = "Command line utility to communicate with ModBus slave (RTU or TCP)"
DESCRIPTION = "mbpoll uses libmodbus (http://libmodbus.org/). \
Although the syntax of these options is very close modpoll proconX program, \
it is a completely independent project. \
 \
mbpoll can: \
 - read discrete inputs \
 - read and write binary outputs (coil) \
 - read input registers \
 - read and write output registers (holding register) \
 \
The reading and writing registers may be in decimal, hexadecimal or \
floating single precision."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.11"

RPM_NAME = "mbpoll-1.4.11-1.9.aarch64.rpm"
RPM_HASH = "3f8ac81ae84501e9c9e14bf77feebb7b4166afc4f9131e2f039300a9035e51d02b2d85a0d2eff862807efd0a7baf0e69453090c5373495dcd53ed3bd0064c38d"

RPROVIDES:${PN} += "mbpoll \
mbpoll(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmodbus.so.5()(64bit)"

inherit rpm
