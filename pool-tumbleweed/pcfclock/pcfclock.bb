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

RPM_NAME = "pcfclock-0.44-269.40.aarch64.rpm"
RPM_HASH = "cafdb1247e5ee9a1457b2a270121bece9297f5759c9bd886400031e19c050c1366b6d167652cd63c39ef9eaa607b7579cd5e63dde38a11325b2bf4324179508f"

RPROVIDES:${PN} += "pcfclock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
pcfclock-kmp \
systemd"

inherit rpm
