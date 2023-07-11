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

RPM_NAME = "newt-0.52.23-2.2.aarch64.rpm"
RPM_HASH = "7df8f29bff144437d8de4b2da5006bac215817ca19e3643e3195e6964e8666593e615bd2d388cfafeb85cacfd9086ed12b425c088032d3a4618d5f10d3689949"

RPROVIDES:${PN} += "newt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnewt.so.0.52 \
libpopt.so.0 \
libslang.so.2"

inherit rpm
