SUMMARY = "PCSC driver for Schlumberger Reflex 60 smartcard readers"
DESCRIPTION = "This package contains a driver for the Reflex 62 and Reflex 64 smart \
card readers produced by Schlumberger. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package. \
 \
 \
 \
Authors: \
-------- \
    David Corcoran <corcoran@linuxnet.com>"
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "pcsc-reflex60-2.2.0-156.25.aarch64.rpm"
RPM_HASH = "096a417ded061b3d81dfb4c774fb5d086520b0b347fb811a48b4c784447dafe2def0121dcfbba6d1f74f961f64d1b310b5c70b7b349bdf02f6a73f3cbc4b8b71"

RPROVIDES:${PN} += "libslb_rf60.so()(64bit) \
pcsc-reflex60 \
pcsc-reflex60(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
pcsc-lite"

inherit rpm
