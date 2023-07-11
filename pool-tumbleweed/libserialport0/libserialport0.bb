SUMMARY = "Handles OS-specific details when using serial ports"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libserialport is a minimal, cross-platform shared library written in C \
that is intended to take care of the OS-specific details when writing \
software that uses serial ports."
LICENSE = "LGPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "libserialport0-0.1.1-2.13.aarch64.rpm"
RPM_HASH = "edf7ec6d0c5ed04a798453b03b472783df504a49c77dd08ae763abca0fc33d76788d54c6102789ecb8dcf04bf015567c300aeed546894eb0f59f12a7a30359a3"

RPROVIDES:${PN} += "libserialport.so.0 \
libserialport0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
