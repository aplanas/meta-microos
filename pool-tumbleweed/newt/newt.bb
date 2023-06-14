SUMMARY = "A library for text mode user interfaces"
DESCRIPTION = "Newt is a programming library for color text-mode, widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
checkboxes, radio buttons, labels, plain text fields, scrollbars, etc., \
to text mode user interfaces. \
 \
This package also contains a Dialog replacement called whiptail. Newt \
is based on the slang library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "newt-0.52.23-2.1.aarch64.rpm"
RPM_HASH = "f693da93ba65b1c2bfe9c31f74cdfb4f7d17dc604ab2c5c68387ea5ed7ef1c6f28b2e45c61e6760d76abfb420b4bc243cb1ba63ccc1b3a6d34bf3bcfc1fe956f"

RPROVIDES:${PN} += "newt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnewt.so.0.52 \
libpopt.so.0 \
libslang.so.2"

inherit rpm
