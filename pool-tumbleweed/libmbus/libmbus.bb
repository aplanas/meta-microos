SUMMARY = "M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
The Meter-Bus is a standard for reading out meter data from electricity meters, heat meters, gas meters, etc. The M-bus standard deals with both the electrical signals on the M-Bus, and the protocol and data format used in transmissions on the M-Bus. The role of libmbus is to decode/encode M-bus data, and to handle the communication with M-Bus devices."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus-0.9.0+59-1.4.aarch64.rpm"
RPM_HASH = "16bbc7a633027a9c0ca476284e6b5ce872cb77320ae9ff47496c930a47602cb5afb4c8902dc418518dc69f6351d25da5732fa59f27969c142f0c59b572495d25"

RPROVIDES:${PN} += "libmbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmbus.so.0"

inherit rpm
