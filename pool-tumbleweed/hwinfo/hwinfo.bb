SUMMARY = "Hardware Library"
DESCRIPTION = "A program that lists results from the hardware detection \
library."
LICENSE = "GPL-2.0-or-later"

PV = "23.1"

RPM_NAME = "hwinfo-23.1-1.1.aarch64.rpm"
RPM_HASH = "6b825b04c9b91bfae967ee6c9ca9546b03cb5c2de5a38885ecca43ca8779a3ec0b1250b5fca5f3205b2039d4cd12d7500eecee554c1d0aac7e953e3061d3fa8f"

RPROVIDES:${PN} += "hwinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhd.so.23"

inherit rpm
