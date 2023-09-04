SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44"

RPM_NAME = "pcfclock-0.44-269.39.aarch64.rpm"
RPM_HASH = "69c7c7925a2c5461b36a51f780a539f10cd3ffbff011dc74e367916252aa4d0cde7125f390269177223ccae799952042c751953e7d6f6f25e389c3bf07bc6ff0"

RPROVIDES:${PN} += "pcfclock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pcfclock-kmp \
systemd"

inherit rpm
