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

RPM_NAME = "libserialport0-0.1.1-2.12.aarch64.rpm"
RPM_HASH = "3af9cb4fdcf3fdd326321178cff63d47e5587b08a58ed342166181a66d00b1e163e047b502d466a30f44303f7b51560b030447752ec41555541835ade178335d"

RPROVIDES:${PN} += "libserialport.so.0 \
libserialport0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
