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

RPM_NAME = "pcfclock-0.44-269.36.aarch64.rpm"
RPM_HASH = "b10ff3382c97a917fff163e41e9b2e022357a1c01140e4de500b43c7a273629f24d18cb96c4fe0b2469358cf635b971da7c7a8d35c73fdee3d5b4f2e8257fc88"

RPROVIDES:${PN} += "pcfclock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pcfclock-kmp \
systemd"

inherit rpm
